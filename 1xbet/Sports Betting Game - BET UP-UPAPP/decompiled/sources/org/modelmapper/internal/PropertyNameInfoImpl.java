package org.modelmapper.internal;

import java.util.Iterator;
import java.util.List;
import org.modelmapper.config.Configuration;
import org.modelmapper.internal.util.Stack;
import org.modelmapper.internal.util.ToStringBuilder;
import org.modelmapper.spi.NameableType;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyNameInfo;
import org.modelmapper.spi.Tokens;

/* loaded from: classes4.dex */
class PropertyNameInfoImpl implements PropertyNameInfo {
    private final Configuration configuration;
    private final Class<?> sourceClass;
    private Tokens sourceClassTokens;
    private Stack<Tokens> sourcePropertyTypeTokens;
    private final Stack<Tokens> sourcePropertyTokens = new Stack<>();
    private final Stack<Tokens> destinationPropertyTokens = new Stack<>();
    private final Stack<PropertyInfo> sourceProperties = new Stack<>();
    private final Stack<PropertyInfo> destinationProperties = new Stack<>();

    PropertyNameInfoImpl(Class<?> cls, Configuration configuration) {
        this.sourceClass = cls;
        this.configuration = configuration;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public List<PropertyInfo> getDestinationProperties() {
        return this.destinationProperties;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public List<Tokens> getDestinationPropertyTokens() {
        return this.destinationPropertyTokens;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public Tokens getSourceClassTokens() {
        if (this.sourceClassTokens == null) {
            this.sourceClassTokens = Tokens.of(this.configuration.getSourceNameTokenizer().tokenize(this.configuration.getSourceNameTransformer().transform(this.sourceClass.getSimpleName(), NameableType.CLASS), NameableType.CLASS));
        }
        return this.sourceClassTokens;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public List<PropertyInfo> getSourceProperties() {
        return this.sourceProperties;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public List<Tokens> getSourcePropertyTokens() {
        return this.sourcePropertyTokens;
    }

    @Override // org.modelmapper.spi.PropertyNameInfo
    public List<Tokens> getSourcePropertyTypeTokens() {
        if (this.sourcePropertyTypeTokens == null) {
            this.sourcePropertyTypeTokens = new Stack<>();
            Iterator<PropertyInfo> it = this.sourceProperties.iterator();
            while (it.hasNext()) {
                pushSourcePropertyType(it.next());
            }
        }
        return this.sourcePropertyTypeTokens;
    }

    public String toString() {
        return new ToStringBuilder(PropertyNameInfoImpl.class).add("sourceProperties", this.sourceProperties).add("destinationProperties", this.destinationProperties).toString();
    }

    void clearSource() {
        this.sourceProperties.clear();
        this.sourcePropertyTokens.clear();
        Stack<Tokens> stack = this.sourcePropertyTypeTokens;
        if (stack != null) {
            stack.clear();
        }
    }

    void popDestination() {
        this.destinationProperties.pop();
        this.destinationPropertyTokens.pop();
    }

    void popSource() {
        this.sourceProperties.pop();
        this.sourcePropertyTokens.pop();
        Stack<Tokens> stack = this.sourcePropertyTypeTokens;
        if (stack != null) {
            stack.pop();
        }
    }

    void pushDestination(String str, Mutator mutator) {
        this.destinationPropertyTokens.push(Tokens.of(this.configuration.getDestinationNameTokenizer().tokenize(str, NameableType.forPropertyType(mutator.getPropertyType()))));
        this.destinationProperties.push(mutator);
    }

    void pushSource(String str, Accessor accessor) {
        this.sourcePropertyTokens.push(Tokens.of(this.configuration.getSourceNameTokenizer().tokenize(str, NameableType.forPropertyType(accessor.getPropertyType()))));
        this.sourceProperties.push(accessor);
        pushSourcePropertyType(accessor);
    }

    private void pushSourcePropertyType(PropertyInfo propertyInfo) {
        if (this.sourcePropertyTypeTokens == null) {
            return;
        }
        this.sourcePropertyTypeTokens.add(Tokens.of(this.configuration.getSourceNameTokenizer().tokenize(this.configuration.getSourceNameTransformer().transform(propertyInfo.getType().getSimpleName(), NameableType.CLASS), NameableType.CLASS)));
    }
}

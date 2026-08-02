package org.modelmapper.internal;

import java.util.List;
import org.modelmapper.Condition;
import org.modelmapper.Provider;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.convention.NameTransformers;
import org.modelmapper.convention.NamingConventions;
import org.modelmapper.internal.converter.AssignableConverter;
import org.modelmapper.internal.converter.ConverterStore;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.valueaccess.ValueAccessStore;
import org.modelmapper.internal.valuemutate.ValueMutateStore;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.NameTokenizer;
import org.modelmapper.spi.NameTransformer;
import org.modelmapper.spi.NamingConvention;
import org.modelmapper.spi.ValueReader;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
public class InheritingConfiguration implements Configuration {
    private Boolean ambiguityIgnored;
    public final ConverterStore converterStore;
    private NameTokenizer destinationNameTokenizer;
    private NameTransformer destinationNameTransformer;
    private NamingConvention destinationNamingConvention;
    private Configuration.AccessLevel fieldAccessLevel;
    private Boolean fieldMatchingEnabled;
    private Boolean fullTypeMatchingRequired;
    private Boolean implicitMatchingEnabled;
    private MatchingStrategy matchingStrategy;
    private Configuration.AccessLevel methodAccessLevel;
    private final Configuration parent;
    private Condition<?, ?> propertyCondition;
    private Provider<?> provider;
    private Boolean skipNullEnabled;
    private NameTokenizer sourceNameTokenizer;
    private NameTransformer sourceNameTransformer;
    private NamingConvention sourceNamingConvention;
    public final TypeMapStore typeMapStore;
    private Boolean useOSGiClassLoaderBridging;
    public final ValueAccessStore valueAccessStore;
    public final ValueMutateStore valueMutateStore;

    public InheritingConfiguration() {
        this.parent = null;
        this.typeMapStore = new TypeMapStore(this);
        this.converterStore = new ConverterStore();
        this.valueAccessStore = new ValueAccessStore();
        this.valueMutateStore = new ValueMutateStore();
        this.sourceNameTokenizer = NameTokenizers.CAMEL_CASE;
        this.destinationNameTokenizer = NameTokenizers.CAMEL_CASE;
        this.sourceNamingConvention = NamingConventions.JAVABEANS_ACCESSOR;
        this.destinationNamingConvention = NamingConventions.JAVABEANS_MUTATOR;
        this.sourceNameTransformer = NameTransformers.JAVABEANS_ACCESSOR;
        this.destinationNameTransformer = NameTransformers.JAVABEANS_MUTATOR;
        this.matchingStrategy = MatchingStrategies.STANDARD;
        this.fieldAccessLevel = Configuration.AccessLevel.PUBLIC;
        this.methodAccessLevel = Configuration.AccessLevel.PUBLIC;
        this.fieldMatchingEnabled = Boolean.FALSE;
        this.ambiguityIgnored = Boolean.FALSE;
        this.fullTypeMatchingRequired = Boolean.FALSE;
        this.implicitMatchingEnabled = Boolean.TRUE;
        this.skipNullEnabled = Boolean.FALSE;
        this.useOSGiClassLoaderBridging = Boolean.FALSE;
    }

    InheritingConfiguration(InheritingConfiguration inheritingConfiguration, boolean z) {
        this.typeMapStore = inheritingConfiguration.typeMapStore;
        this.converterStore = inheritingConfiguration.converterStore;
        this.valueAccessStore = inheritingConfiguration.valueAccessStore;
        this.valueMutateStore = inheritingConfiguration.valueMutateStore;
        if (z) {
            this.parent = inheritingConfiguration;
            return;
        }
        this.parent = null;
        this.sourceNameTokenizer = inheritingConfiguration.sourceNameTokenizer;
        this.destinationNameTokenizer = inheritingConfiguration.destinationNameTokenizer;
        this.sourceNamingConvention = inheritingConfiguration.sourceNamingConvention;
        this.destinationNamingConvention = inheritingConfiguration.destinationNamingConvention;
        this.sourceNameTransformer = inheritingConfiguration.sourceNameTransformer;
        this.destinationNameTransformer = inheritingConfiguration.destinationNameTransformer;
        this.matchingStrategy = inheritingConfiguration.matchingStrategy;
        this.fieldAccessLevel = inheritingConfiguration.fieldAccessLevel;
        this.methodAccessLevel = inheritingConfiguration.methodAccessLevel;
        this.fieldMatchingEnabled = inheritingConfiguration.fieldMatchingEnabled;
        this.ambiguityIgnored = inheritingConfiguration.ambiguityIgnored;
        this.provider = inheritingConfiguration.provider;
        this.propertyCondition = inheritingConfiguration.propertyCondition;
        this.fullTypeMatchingRequired = inheritingConfiguration.fullTypeMatchingRequired;
        this.implicitMatchingEnabled = inheritingConfiguration.implicitMatchingEnabled;
        this.skipNullEnabled = inheritingConfiguration.skipNullEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.config.Configuration
    public <T> Configuration addValueReader(ValueReader<T> valueReader) {
        getValueReaders().add(valueReader);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.config.Configuration
    public <T> Configuration addValueWriter(ValueWriter<T> valueWriter) {
        getValueWriters().add(valueWriter);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration copy() {
        return new InheritingConfiguration(this, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InheritingConfiguration inheritingConfiguration = (InheritingConfiguration) obj;
        return getSourceNameTransformer().equals(inheritingConfiguration.getSourceNameTransformer()) && getDestinationNameTransformer().equals(inheritingConfiguration.getDestinationNameTransformer()) && getFieldAccessLevel() == inheritingConfiguration.getFieldAccessLevel() && getMethodAccessLevel() == inheritingConfiguration.getMethodAccessLevel() && isFieldMatchingEnabled() == inheritingConfiguration.isFieldMatchingEnabled();
    }

    @Override // org.modelmapper.config.Configuration
    public List<ConditionalConverter<?, ?>> getConverters() {
        return this.converterStore.getConverters();
    }

    @Override // org.modelmapper.config.Configuration
    public NameTokenizer getDestinationNameTokenizer() {
        NameTokenizer nameTokenizer = this.destinationNameTokenizer;
        return nameTokenizer == null ? ((Configuration) Assert.notNull(this.parent)).getDestinationNameTokenizer() : nameTokenizer;
    }

    @Override // org.modelmapper.config.Configuration
    public NameTransformer getDestinationNameTransformer() {
        NameTransformer nameTransformer = this.destinationNameTransformer;
        return nameTransformer == null ? ((Configuration) Assert.notNull(this.parent)).getDestinationNameTransformer() : nameTransformer;
    }

    @Override // org.modelmapper.config.Configuration
    public NamingConvention getDestinationNamingConvention() {
        NamingConvention namingConvention = this.destinationNamingConvention;
        return namingConvention == null ? ((Configuration) Assert.notNull(this.parent)).getDestinationNamingConvention() : namingConvention;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration.AccessLevel getFieldAccessLevel() {
        Configuration.AccessLevel accessLevel = this.fieldAccessLevel;
        return accessLevel == null ? ((Configuration) Assert.notNull(this.parent)).getFieldAccessLevel() : accessLevel;
    }

    @Override // org.modelmapper.config.Configuration
    public MatchingStrategy getMatchingStrategy() {
        MatchingStrategy matchingStrategy = this.matchingStrategy;
        return matchingStrategy == null ? ((Configuration) Assert.notNull(this.parent)).getMatchingStrategy() : matchingStrategy;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration.AccessLevel getMethodAccessLevel() {
        Configuration.AccessLevel accessLevel = this.methodAccessLevel;
        return accessLevel == null ? ((Configuration) Assert.notNull(this.parent)).getMethodAccessLevel() : accessLevel;
    }

    @Override // org.modelmapper.config.Configuration
    public Condition<?, ?> getPropertyCondition() {
        Configuration configuration = this.parent;
        if (configuration != null) {
            Condition<?, ?> condition = this.propertyCondition;
            return condition == null ? configuration.getPropertyCondition() : condition;
        }
        return this.propertyCondition;
    }

    @Override // org.modelmapper.config.Configuration
    public Provider<?> getProvider() {
        Configuration configuration = this.parent;
        if (configuration != null) {
            Provider<?> provider = this.provider;
            return provider == null ? ((Configuration) Assert.notNull(configuration)).getProvider() : provider;
        }
        return this.provider;
    }

    @Override // org.modelmapper.config.Configuration
    public NameTokenizer getSourceNameTokenizer() {
        NameTokenizer nameTokenizer = this.sourceNameTokenizer;
        return nameTokenizer == null ? ((Configuration) Assert.notNull(this.parent)).getSourceNameTokenizer() : nameTokenizer;
    }

    @Override // org.modelmapper.config.Configuration
    public NameTransformer getSourceNameTransformer() {
        NameTransformer nameTransformer = this.sourceNameTransformer;
        return nameTransformer == null ? ((Configuration) Assert.notNull(this.parent)).getSourceNameTransformer() : nameTransformer;
    }

    @Override // org.modelmapper.config.Configuration
    public NamingConvention getSourceNamingConvention() {
        NamingConvention namingConvention = this.sourceNamingConvention;
        return namingConvention == null ? ((Configuration) Assert.notNull(this.parent)).getSourceNamingConvention() : namingConvention;
    }

    @Override // org.modelmapper.config.Configuration
    public List<ValueReader<?>> getValueReaders() {
        return this.valueAccessStore.getValueReaders();
    }

    @Override // org.modelmapper.config.Configuration
    public List<ValueWriter<?>> getValueWriters() {
        return this.valueMutateStore.getValueWriters();
    }

    public int hashCode() {
        return ((((((((getSourceNameTransformer().hashCode() + 31) * 31) + getDestinationNameTransformer().hashCode()) * 31) + getFieldAccessLevel().hashCode()) * 31) + getMethodAccessLevel().hashCode()) * 31) + (isFieldMatchingEnabled() ? 1231 : 1237);
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isAmbiguityIgnored() {
        Boolean bool = this.ambiguityIgnored;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isAmbiguityIgnored();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isFieldMatchingEnabled() {
        Boolean bool = this.fieldMatchingEnabled;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isFieldMatchingEnabled();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isFullTypeMatchingRequired() {
        Boolean bool = this.fullTypeMatchingRequired;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isFullTypeMatchingRequired();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isImplicitMappingEnabled() {
        Boolean bool = this.implicitMatchingEnabled;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isImplicitMappingEnabled();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isSkipNullEnabled() {
        Boolean bool = this.skipNullEnabled;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isSkipNullEnabled();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isUseOSGiClassLoaderBridging() {
        Boolean bool = this.useOSGiClassLoaderBridging;
        if (bool == null) {
            return ((Configuration) Assert.notNull(this.parent)).isUseOSGiClassLoaderBridging();
        }
        return bool.booleanValue();
    }

    @Override // org.modelmapper.config.Configuration
    public boolean isDeepCopyEnabled() {
        return this.converterStore.hasConverter(AssignableConverter.class);
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setAmbiguityIgnored(boolean z) {
        this.ambiguityIgnored = Boolean.valueOf(z);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setDestinationNameTokenizer(NameTokenizer nameTokenizer) {
        this.destinationNameTokenizer = (NameTokenizer) Assert.notNull(nameTokenizer);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setDestinationNameTransformer(NameTransformer nameTransformer) {
        this.destinationNameTransformer = (NameTransformer) Assert.notNull(nameTransformer);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setDestinationNamingConvention(NamingConvention namingConvention) {
        this.destinationNamingConvention = (NamingConvention) Assert.notNull(namingConvention);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setFieldAccessLevel(Configuration.AccessLevel accessLevel) {
        this.fieldAccessLevel = (Configuration.AccessLevel) Assert.notNull(accessLevel);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setFieldMatchingEnabled(boolean z) {
        this.fieldMatchingEnabled = Boolean.valueOf(z);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setFullTypeMatchingRequired(boolean z) {
        this.fullTypeMatchingRequired = Boolean.valueOf(z);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setImplicitMappingEnabled(boolean z) {
        this.implicitMatchingEnabled = Boolean.valueOf(z);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setSkipNullEnabled(boolean z) {
        this.skipNullEnabled = Boolean.valueOf(z);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setDeepCopyEnabled(boolean z) {
        if (z && this.converterStore.hasConverter(AssignableConverter.class)) {
            this.converterStore.removeConverter(AssignableConverter.class);
        } else if (!z && this.converterStore.hasConverter(AssignableConverter.class)) {
            this.converterStore.addConverter(new AssignableConverter());
        }
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setMatchingStrategy(MatchingStrategy matchingStrategy) {
        this.matchingStrategy = (MatchingStrategy) Assert.notNull(matchingStrategy);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setMethodAccessLevel(Configuration.AccessLevel accessLevel) {
        this.methodAccessLevel = (Configuration.AccessLevel) Assert.notNull(accessLevel);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setPropertyCondition(Condition<?, ?> condition) {
        this.propertyCondition = (Condition) Assert.notNull(condition);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setProvider(Provider<?> provider) {
        this.provider = (Provider) Assert.notNull(provider);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setSourceNameTokenizer(NameTokenizer nameTokenizer) {
        this.sourceNameTokenizer = (NameTokenizer) Assert.notNull(nameTokenizer);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setSourceNameTransformer(NameTransformer nameTransformer) {
        this.sourceNameTransformer = (NameTransformer) Assert.notNull(nameTransformer);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setSourceNamingConvention(NamingConvention namingConvention) {
        this.sourceNamingConvention = (NamingConvention) Assert.notNull(namingConvention);
        return this;
    }

    @Override // org.modelmapper.config.Configuration
    public Configuration setUseOSGiClassLoaderBridging(boolean z) {
        this.useOSGiClassLoaderBridging = Boolean.valueOf(z);
        return this;
    }
}

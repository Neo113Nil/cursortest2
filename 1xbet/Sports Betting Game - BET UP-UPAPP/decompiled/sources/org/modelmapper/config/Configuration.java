package org.modelmapper.config;

import java.util.List;
import org.modelmapper.Condition;
import org.modelmapper.Provider;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.NameTokenizer;
import org.modelmapper.spi.NameTransformer;
import org.modelmapper.spi.NamingConvention;
import org.modelmapper.spi.ValueReader;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
public interface Configuration {

    public enum AccessLevel {
        PUBLIC,
        PROTECTED,
        PACKAGE_PRIVATE,
        PRIVATE
    }

    <T> Configuration addValueReader(ValueReader<T> valueReader);

    <T> Configuration addValueWriter(ValueWriter<T> valueWriter);

    Configuration copy();

    List<ConditionalConverter<?, ?>> getConverters();

    NameTokenizer getDestinationNameTokenizer();

    NameTransformer getDestinationNameTransformer();

    NamingConvention getDestinationNamingConvention();

    AccessLevel getFieldAccessLevel();

    MatchingStrategy getMatchingStrategy();

    AccessLevel getMethodAccessLevel();

    Condition<?, ?> getPropertyCondition();

    Provider<?> getProvider();

    NameTokenizer getSourceNameTokenizer();

    NameTransformer getSourceNameTransformer();

    NamingConvention getSourceNamingConvention();

    List<ValueReader<?>> getValueReaders();

    List<ValueWriter<?>> getValueWriters();

    boolean isAmbiguityIgnored();

    boolean isDeepCopyEnabled();

    boolean isFieldMatchingEnabled();

    boolean isFullTypeMatchingRequired();

    boolean isImplicitMappingEnabled();

    boolean isSkipNullEnabled();

    boolean isUseOSGiClassLoaderBridging();

    Configuration setAmbiguityIgnored(boolean z);

    Configuration setDeepCopyEnabled(boolean z);

    Configuration setDestinationNameTokenizer(NameTokenizer nameTokenizer);

    Configuration setDestinationNameTransformer(NameTransformer nameTransformer);

    Configuration setDestinationNamingConvention(NamingConvention namingConvention);

    Configuration setFieldAccessLevel(AccessLevel accessLevel);

    Configuration setFieldMatchingEnabled(boolean z);

    Configuration setFullTypeMatchingRequired(boolean z);

    Configuration setImplicitMappingEnabled(boolean z);

    Configuration setMatchingStrategy(MatchingStrategy matchingStrategy);

    Configuration setMethodAccessLevel(AccessLevel accessLevel);

    Configuration setPropertyCondition(Condition<?, ?> condition);

    Configuration setProvider(Provider<?> provider);

    Configuration setSkipNullEnabled(boolean z);

    Configuration setSourceNameTokenizer(NameTokenizer nameTokenizer);

    Configuration setSourceNameTransformer(NameTransformer nameTransformer);

    Configuration setSourceNamingConvention(NamingConvention namingConvention);

    Configuration setUseOSGiClassLoaderBridging(boolean z);
}

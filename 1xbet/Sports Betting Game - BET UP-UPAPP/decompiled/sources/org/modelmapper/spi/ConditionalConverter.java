package org.modelmapper.spi;

import org.modelmapper.Converter;

/* loaded from: classes4.dex */
public interface ConditionalConverter<S, D> extends Converter<S, D> {

    public enum MatchResult {
        FULL,
        PARTIAL,
        NONE
    }

    MatchResult match(Class<?> cls, Class<?> cls2);
}

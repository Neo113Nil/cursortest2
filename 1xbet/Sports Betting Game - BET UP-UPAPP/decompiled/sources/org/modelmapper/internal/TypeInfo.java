package org.modelmapper.internal;

import java.util.Map;
import org.modelmapper.config.Configuration;

/* loaded from: classes4.dex */
interface TypeInfo<T> {
    Map<String, Accessor> getAccessors();

    Configuration getConfiguration();

    Map<String, Mutator> getMutators();

    Class<T> getType();
}

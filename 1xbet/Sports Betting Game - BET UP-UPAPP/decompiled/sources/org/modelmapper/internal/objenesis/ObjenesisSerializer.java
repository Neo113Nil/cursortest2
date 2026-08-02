package org.modelmapper.internal.objenesis;

import org.modelmapper.internal.objenesis.strategy.SerializingInstantiatorStrategy;

/* loaded from: classes4.dex */
public class ObjenesisSerializer extends ObjenesisBase {
    public ObjenesisSerializer() {
        super(new SerializingInstantiatorStrategy());
    }

    public ObjenesisSerializer(boolean z) {
        super(new SerializingInstantiatorStrategy(), z);
    }
}

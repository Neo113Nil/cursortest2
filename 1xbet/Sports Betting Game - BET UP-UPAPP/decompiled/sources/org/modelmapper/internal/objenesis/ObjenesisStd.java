package org.modelmapper.internal.objenesis;

import org.modelmapper.internal.objenesis.strategy.StdInstantiatorStrategy;

/* loaded from: classes4.dex */
public class ObjenesisStd extends ObjenesisBase {
    public ObjenesisStd() {
        super(new StdInstantiatorStrategy());
    }

    public ObjenesisStd(boolean z) {
        super(new StdInstantiatorStrategy(), z);
    }
}

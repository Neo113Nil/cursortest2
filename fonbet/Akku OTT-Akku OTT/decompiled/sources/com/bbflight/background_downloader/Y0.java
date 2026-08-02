package com.bbflight.background_downloader;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Integer) obj).intValue();
        for (W0 w0 : W0.m) {
            if (w0.ordinal() == intValue) {
                return w0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

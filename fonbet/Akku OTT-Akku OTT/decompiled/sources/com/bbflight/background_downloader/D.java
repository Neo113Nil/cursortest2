package com.bbflight.background_downloader;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ D(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                for (B b : B.i) {
                    if (b.ordinal() == intValue) {
                        return b;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                Intrinsics.checkNotNullParameter((kotlinx.serialization.descriptors.a) obj, "<this>");
                return Unit.INSTANCE;
        }
    }
}

package com.google.gson.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ObjectConstructor {
    public static Iterator a(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Map lambda$newMapConstructor$15;
        lambda$newMapConstructor$15 = ConstructorConstructor.lambda$newMapConstructor$15();
        return lambda$newMapConstructor$15;
    }
}

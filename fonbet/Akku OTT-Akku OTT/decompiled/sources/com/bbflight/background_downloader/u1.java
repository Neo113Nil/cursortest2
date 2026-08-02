package com.bbflight.background_downloader;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ u1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                for (s1 s1Var : s1.f) {
                    if (s1Var.ordinal() == intValue) {
                        return s1Var;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                kotlinx.serialization.descriptors.a buildSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("JsonPrimitive", new kotlinx.serialization.json.o(new kotlinx.serialization.json.j()), CollectionsKt.emptyList());
                buildSerialDescriptor.a("JsonNull", new kotlinx.serialization.json.o(new kotlinx.serialization.json.k()), CollectionsKt.emptyList());
                buildSerialDescriptor.a("JsonLiteral", new kotlinx.serialization.json.o(new fman.ge.smart_auth.c(1)), CollectionsKt.emptyList());
                buildSerialDescriptor.a("JsonObject", new kotlinx.serialization.json.o(new kotlinx.serialization.json.l()), CollectionsKt.emptyList());
                buildSerialDescriptor.a("JsonArray", new kotlinx.serialization.json.o(new kotlinx.serialization.json.m()), CollectionsKt.emptyList());
                return Unit.INSTANCE;
        }
    }
}

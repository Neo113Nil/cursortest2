package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3995pg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3995pg(Context context, Continuation continuation) {
        super(2, continuation);
        this.f7305a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3995pg(this.f7305a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3995pg(this.f7305a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4051rg c4051rg = C4051rg.f7353a;
        Context context = this.f7305a;
        C4136ug c4136ug = C4051rg.c;
        if (c4136ug == null) {
            c4136ug = new C4136ug(context);
            C4051rg.c = c4136ug;
        }
        String a2 = c4136ug.f7416a.a("omid_js_string");
        if (a2 != null) {
            return a2;
        }
        Context context2 = this.f7305a;
        int i = R.raw.inmobi_omid_js;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        try {
            InputStream openRawResource = context2.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            Reader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return readText;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }
}

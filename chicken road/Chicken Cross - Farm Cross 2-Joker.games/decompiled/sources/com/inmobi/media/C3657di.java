package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3657di extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7071a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3657di(Context context, Continuation continuation) {
        super(2, continuation);
        this.f7071a = context;
    }

    public static final boolean a(String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "auto_", false, 2, (Object) null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3657di(this.f7071a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3657di(this.f7071a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            C3770hi c3770hi = C3770hi.f7146a;
            Context context = this.f7071a;
            c3770hi.getClass();
            if (C3770hi.d == null) {
                C3770hi.d = new Rh(context, "pub_signals_store");
            }
            Rh rh = null;
            try {
                Rh rh2 = C3770hi.d;
                if (rh2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    rh2 = null;
                }
                String a2 = rh2.a("saved_signals");
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject(a2);
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    Iterator it = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.asSequence(keys), new Function1() { // from class: com.inmobi.media.di$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(C3657di.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    Rh rh3 = C3770hi.d;
                    if (rh3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        rh3 = null;
                    }
                    String value = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    rh3.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    rh3.f6829a.a("saved_signals", value, true);
                }
            } catch (Exception e) {
                Rh rh4 = C3770hi.d;
                if (rh4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                } else {
                    rh = rh4;
                }
                rh.getClass();
                Intrinsics.checkNotNullParameter("saved_signals", "key");
                rh.f6829a.a("saved_signals");
                C3770hi.f7146a.getClass();
                C3770hi.e.a();
                Kc.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                Lazy lazy = Ba.f6473a;
                Ba.a(new C3810j3(e));
            }
            C3770hi c3770hi2 = C3770hi.f7146a;
            c3770hi2.getClass();
            C3770hi.b();
            C3770hi.a(c3770hi2);
            C3584b2 c3584b2 = C3770hi.e;
            c3584b2.c = c3584b2.f7022a.invoke();
            C3584b2 c3584b22 = C3770hi.f;
            c3584b22.c = c3584b22.f7022a.invoke();
        } catch (Exception e2) {
            Kc.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            Lazy lazy2 = Ba.f6473a;
            U9.a(e2);
        }
        C3770hi.f7146a.getClass();
        C3584b2 c3584b23 = C3770hi.e;
        c3584b23.c = c3584b23.f7022a.invoke();
        C3584b2 c3584b24 = C3770hi.f;
        c3584b24.c = c3584b24.f7022a.invoke();
        return Unit.INSTANCE;
    }
}

package com.inmobi.media;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes6.dex */
public final class Bk extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6479a;
    public final /* synthetic */ Ck b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ WebView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk(Ck ck, long j, String str, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.b = ck;
        this.c = j;
        this.d = str;
        this.e = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Bk(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int ordinal;
        WebView webView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6479a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b.f6497a;
            this.f6479a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean z2 = false;
        boolean z3 = this.c == this.b.e;
        String str = this.d;
        if (str != null) {
            WebView webView2 = this.e;
            if (Intrinsics.areEqual(str, webView2 != null ? webView2.getUrl() : null)) {
                z = true;
                ordinal = this.b.g.ordinal();
                if (ordinal == 1 ? !this.b.h : ordinal == 3) {
                    z2 = true;
                }
                if (z3 && z && !this.b.f && z2 && (webView = this.e) != null && webView.isAttachedToWindow()) {
                    this.b.a("PAGE_COMMIT_VISIBLE", this.d);
                }
                return Unit.INSTANCE;
            }
        }
        z = false;
        ordinal = this.b.g.ordinal();
        if (ordinal == 1) {
            z2 = true;
            if (z3) {
            }
            return Unit.INSTANCE;
        }
        z2 = true;
        if (z3) {
            this.b.a("PAGE_COMMIT_VISIBLE", this.d);
        }
        return Unit.INSTANCE;
    }
}

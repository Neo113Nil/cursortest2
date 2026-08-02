package com.amplitude.android.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.amplitude.android.internal.c;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.android.f;
import kotlinx.coroutines.internal.p;

@DebugMetadata(c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1", f = "ViewHierarchyScanner.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nViewHierarchyScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyScanner.kt\ncom/amplitude/android/internal/ViewHierarchyScanner$findTarget$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes3.dex */
public final class a extends SuspendLambda implements Function2<K, Continuation<? super c>, Object> {
    public int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ com.amplitude.common.a c;
    public final /* synthetic */ Pair<Float, Float> d;
    public final /* synthetic */ List<com.amplitude.android.internal.locators.b> e;

    @DebugMetadata(c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1$1", f = "ViewHierarchyScanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.amplitude.android.internal.a$a, reason: collision with other inner class name */
    public static final class C0035a extends SuspendLambda implements Function2<K, Continuation<? super c>, Object> {
        public final /* synthetic */ View a;
        public final /* synthetic */ Pair<Float, Float> b;
        public final /* synthetic */ List<com.amplitude.android.internal.locators.b> c;
        public final /* synthetic */ com.amplitude.common.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0035a(View view, com.amplitude.common.a aVar, List list, Pair pair, Continuation continuation) {
            super(2, continuation);
            c.a aVar2 = c.a.a;
            this.a = view;
            this.b = pair;
            this.c = list;
            this.d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c.a aVar = c.a.a;
            List<com.amplitude.android.internal.locators.b> list = this.c;
            return new C0035a(this.a, this.d, list, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super c> continuation) {
            return ((C0035a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            c.a aVar = c.a.a;
            return b.a(this.a, this.b, this.c, this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, com.amplitude.common.a aVar, List list, Pair pair, Continuation continuation) {
        super(2, continuation);
        c.a aVar2 = c.a.a;
        this.b = view;
        this.c = aVar;
        this.d = pair;
        this.e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        c.a aVar = c.a.a;
        return new a(this.b, this.c, this.e, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super c> continuation) {
        return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Looper mainLooper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            View view = this.b;
            Handler handler = view.getHandler();
            com.amplitude.common.a aVar = this.c;
            if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                aVar.b("Unable to get main looper");
                return null;
            }
            boolean areEqual = Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread());
            Pair<Float, Float> pair = this.d;
            if (areEqual) {
                c.a aVar2 = c.a.a;
                return b.a(view, pair, this.e, aVar);
            }
            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
            f fVar = p.a;
            c.a aVar3 = c.a.a;
            C0035a c0035a = new C0035a(view, this.c, this.e, pair, null);
            this.a = 1;
            obj = C1082i.f(c0035a, fVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (c) obj;
    }
}

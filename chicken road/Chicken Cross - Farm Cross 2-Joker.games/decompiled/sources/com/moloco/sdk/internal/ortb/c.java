package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.ortb.model.C4784g;
import com.moloco.sdk.internal.scheduling.DispatcherProvider;
import com.moloco.sdk.internal.x;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.Json;

/* loaded from: classes7.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Json f10513a;
    public final DispatcherProvider b;

    @DebugMetadata(c = "com.moloco.sdk.internal.ortb.BidResponseParserImpl$invoke$2", f = "BidResponseParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super x<C4784g, com.moloco.sdk.internal.ortb.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10514a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super x<C4784g, com.moloco.sdk.internal.ortb.a>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10514a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Json json = c.this.f10513a;
                String str = this.c;
                json.getSerializersModule();
                return new x.b(e.a((C4784g) json.decodeFromString(C4784g.INSTANCE.serializer(), str)));
            } catch (CancellationException e) {
                throw e;
            } catch (MissingFieldException e2) {
                return new x.a(new a.b(e2.getMissingFields()));
            } catch (Exception e3) {
                return new x.a(new a.C1479a(e3));
            }
        }
    }

    public c(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f10513a = json;
        this.b = com.moloco.sdk.internal.scheduling.b.a();
    }

    @Override // com.moloco.sdk.internal.ortb.b
    public Object a(String str, Continuation<? super x<C4784g, com.moloco.sdk.internal.ortb.a>> continuation) {
        return BuildersKt.withContext(this.b.getIo(), new a(str, null), continuation);
    }
}

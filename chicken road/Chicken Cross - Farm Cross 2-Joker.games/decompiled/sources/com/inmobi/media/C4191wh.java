package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4191wh extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7461a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4191wh(String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4191wh c4191wh = new C4191wh(this.d, this.e, continuation);
        c4191wh.c = obj;
        return c4191wh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4191wh) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (com.inmobi.media.S9.a(r3, "pings", r10, r9, 4) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        S9 s9;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S9 s92 = (S9) this.c;
            String str = "SELECT priority, retry_count FROM pings WHERE " + this.d;
            ArrayList arrayList2 = this.e;
            this.c = s92;
            this.f7461a = arrayList2;
            this.b = 1;
            s92.getClass();
            Object a2 = s92.a(new O9(s92, str, null), this);
            if (a2 != coroutine_suspended) {
                s9 = s92;
                obj = a2;
                arrayList = arrayList2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        arrayList = this.f7461a;
        s9 = (S9) this.c;
        ResultKt.throwOnFailure(obj);
        Iterable<ContentValues> iterable = (Iterable) obj;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ContentValues contentValues : iterable) {
            String asString = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Integer asInteger = contentValues.getAsInteger("retry_count");
            arrayList3.add(TuplesKt.to(asString, Boxing.boxInt(asInteger != null ? asInteger.intValue() : 0)));
        }
        arrayList.addAll(arrayList3);
        String str2 = this.d;
        this.c = null;
        this.f7461a = null;
        this.b = 2;
    }
}

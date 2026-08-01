package com.inmobi.media;

import android.content.ContentValues;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class Fh extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6560a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Gh d;
    public final /* synthetic */ Vg e;
    public final /* synthetic */ Ref.ObjectRef f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Gh gh, Vg vg, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.d = gh;
        this.e = vg;
        this.f = objectRef;
    }

    public static final String a(String str) {
        return "SELECT * FROM pings WHERE priority=\"" + str + "\" ORDER BY time_created ASC LIMIT 1";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Fh fh = new Fh(this.d, this.e, this.f, continuation);
        fh.c = obj;
        return fh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fh) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010c, code lost:
    
        if (r4.a("pings", "id=?", r5, r11) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r12 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006f, code lost:
    
        if (r12 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.inmobi.media.Wa] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, com.inmobi.media.Ya] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        S9 s9;
        Function1 function1;
        ContentValues contentValues;
        Vg a2;
        S9 s92;
        Vg vg;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            s9 = (S9) this.c;
            Gh gh = this.d;
            String str = this.e.b;
            this.c = s9;
            this.b = 1;
            obj = gh.b(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    Function1 function12 = (Function1) this.f6560a;
                    S9 s93 = (S9) this.c;
                    ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    s9 = s93;
                    contentValues = (ContentValues) CollectionsKt.firstOrNull((List) obj);
                    if (contentValues == null) {
                        a2 = Hh.a(contentValues);
                        s92 = s9;
                        if (a2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(this.e.e, Constants.HIGH)) {
                        String str2 = (String) function1.invoke(Constants.HIGH);
                        this.c = s9;
                        this.f6560a = null;
                        this.b = 3;
                        s9.getClass();
                        obj = s9.a(new O9(s9, str2, null), this);
                    }
                    s92 = s9;
                    a2 = null;
                    if (a2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    s9 = (S9) this.c;
                    ResultKt.throwOnFailure(obj);
                    ContentValues contentValues2 = (ContentValues) CollectionsKt.firstOrNull((List) obj);
                    if (contentValues2 != null) {
                        a2 = Hh.a(contentValues2);
                        s92 = s9;
                        if (a2 != null) {
                            String[] strArr = {a2.b};
                            this.c = s92;
                            this.f6560a = a2;
                            this.b = 4;
                        }
                        return Unit.INSTANCE;
                    }
                    s92 = s9;
                    a2 = null;
                    if (a2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vg = (Vg) this.c;
                    ResultKt.throwOnFailure(obj);
                    this.f.element = new Ya(this.e, vg);
                    return Unit.INSTANCE;
                }
                Vg vg2 = (Vg) this.f6560a;
                s92 = (S9) this.c;
                ResultKt.throwOnFailure(obj);
                a2 = vg2;
                ContentValues a3 = Hh.a(this.e);
                this.c = a2;
                this.f6560a = null;
                this.b = 5;
                if (s92.a("pings", a3, 4, this) != coroutine_suspended) {
                    vg = a2;
                    this.f.element = new Ya(this.e, vg);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            s9 = (S9) this.c;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f.element = new Wa(this.e);
            return Unit.INSTANCE;
        }
        Function1 function13 = new Function1() { // from class: com.inmobi.media.Fh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Fh.a((String) obj2);
            }
        };
        String str3 = (String) function13.invoke(Constants.NORMAL);
        this.c = s9;
        this.f6560a = function13;
        this.b = 2;
        s9.getClass();
        Object a4 = s9.a(new O9(s9, str3, null), this);
        if (a4 != coroutine_suspended) {
            function1 = function13;
            obj = a4;
            contentValues = (ContentValues) CollectionsKt.firstOrNull((List) obj);
            if (contentValues == null) {
            }
        }
        return coroutine_suspended;
    }
}

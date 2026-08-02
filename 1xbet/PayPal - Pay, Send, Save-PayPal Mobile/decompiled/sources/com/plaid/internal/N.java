package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N implements com.plaid.internal.InterfaceC0669v7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.L f5847a;

    public N(com.plaid.internal.L l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "");
        this.f5847a = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.plaid.internal.InterfaceC0669v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.M m;
        int i;
        com.plaid.internal.C0541h4 c0541h4;
        java.lang.String str2;
        try {
            if (continuationImpl instanceof com.plaid.internal.M) {
                m = (com.plaid.internal.M) continuationImpl;
                int i2 = m.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m.d = i2 - 2147483648;
                    java.lang.Object obj = m.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = m.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!android.util.Patterns.WEB_URL.matcher(str).matches()) {
                            throw com.plaid.internal.AbstractC0678w7.b.f6612a;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                            throw com.plaid.internal.AbstractC0678w7.e.f6615a;
                        }
                        com.plaid.internal.L l = this.f5847a;
                        m.f5838a = this;
                        m.d = 1;
                        obj = l.a(str, m);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.plaid.internal.N n = m.f5838a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    c0541h4 = (com.plaid.internal.C0541h4) obj;
                    str2 = c0541h4.b;
                    if (str2 == null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "ErrorCode=0&ErrorDescription=Success", false, 2, (java.lang.Object) null)) {
                        return new com.plaid.internal.InterfaceC0624q6.b(c0541h4);
                    }
                    throw new com.plaid.internal.AbstractC0678w7.d(java.lang.String.valueOf(c0541h4.b));
                }
            }
            if (i != 0) {
            }
            c0541h4 = (com.plaid.internal.C0541h4) obj;
            str2 = c0541h4.b;
            if (str2 == null) {
            }
            throw new com.plaid.internal.AbstractC0678w7.d(java.lang.String.valueOf(c0541h4.b));
        } catch (com.plaid.internal.AbstractC0678w7 e) {
            return new com.plaid.internal.InterfaceC0624q6.a(e);
        } catch (java.lang.Exception e2) {
            return new com.plaid.internal.InterfaceC0624q6.a(new com.plaid.internal.AbstractC0678w7.f(e2));
        }
        m = new com.plaid.internal.M(this, continuationImpl);
        java.lang.Object obj2 = m.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = m.d;
    }
}

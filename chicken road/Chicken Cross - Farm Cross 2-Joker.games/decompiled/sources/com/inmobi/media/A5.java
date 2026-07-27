package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.InetAddress;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f6448a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(Network network, Continuation continuation) {
        super(2, continuation);
        this.f6448a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A5(this.f6448a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A5(this.f6448a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:2|3)|(3:7|(1:9)(1:23)|(6:11|12|13|14|15|16))|24|13|14|15|16|(2:(0)|(1:21))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r1 = com.inmobi.media.Ba.f6473a;
        com.inmobi.media.Ba.a(new com.inmobi.media.C3810j3(r0));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AdConfig.CustomNetworkValidation a2;
        String urlDomain;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            try {
                a2 = B5.a();
            } catch (Throwable th) {
                B5.e.set(false);
                throw th;
            }
        } catch (Exception unused) {
        }
        if (a2 != null && (urlDomain = a2.getUrlDomain()) != null) {
            if (urlDomain.length() <= 0) {
                urlDomain = null;
            }
            if (urlDomain != null) {
                z = !Intrinsics.areEqual(InetAddress.getByName(urlDomain).toString(), "");
                B5.b = z;
                B5.f6469a = this.f6448a;
                B5.c = SystemClock.elapsedRealtime();
                String str = "CustomNetworkValidator updated Internet status: " + B5.b;
                B5.e.set(false);
                return Unit.INSTANCE;
            }
        }
        z = false;
        B5.b = z;
        B5.f6469a = this.f6448a;
        B5.c = SystemClock.elapsedRealtime();
        String str2 = "CustomNetworkValidator updated Internet status: " + B5.b;
        B5.e.set(false);
        return Unit.INSTANCE;
    }
}

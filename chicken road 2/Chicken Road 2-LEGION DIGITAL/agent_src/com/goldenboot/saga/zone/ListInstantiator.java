package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u00060\u0000j\u0002`\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0081\b¢\u0006\u0004\b\r\u0010\u000e*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f¨\u0006\u0011"}, d2 = {"", "obj", "", "name", "growPayload", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "evictLayout", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "injectMetric", "(Ljava/lang/Object;Lcom/goldenboot/saga/zone/ElevationNode;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListInstantiator {
    public static final Object evictLayout(Object obj) {
        return obj.getClass();
    }

    public static final String growPayload(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }

    @ReceiverAdministrator
    public static final /* synthetic */ <R> R injectMetric(Object obj, ElevationNode elevationNode) {
        R r;
        synchronized (obj) {
            try {
                r = (R) elevationNode.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return r;
    }
}

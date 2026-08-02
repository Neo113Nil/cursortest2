package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.internal.C1086c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroid/content/BroadcastReceiver;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/K;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "goAsync", "(Landroid/content/BroadcastReceiver;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineBroadcastReceiverKt {
    public static final void goAsync(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2<? super K, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C1086c a = L.a(CoroutineContext.Element.DefaultImpls.plus(S0.a(), coroutineContext));
        C1082i.c(a, null, null, new CoroutineBroadcastReceiverKt$goAsync$1(function2, a, broadcastReceiver.goAsync(), null), 3);
    }

    public static void goAsync$default(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C1049c0.a;
        }
        goAsync(broadcastReceiver, coroutineContext, function2);
    }
}

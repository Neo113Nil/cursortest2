package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJR\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViews;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/glance/appwidget/LayoutConfiguration;", "initializeLayoutConfiguration", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/DpSize;", "size", "state", "Landroid/os/Bundle;", "appWidgetOptions", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "Landroidx/glance/appwidget/RemoteViewsCompositionResult;", "compose-YuIfr8w", "(Landroid/content/Context;JLjava/lang/Object;Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compose", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "layoutConfiguration", "Landroidx/glance/appwidget/LayoutConfiguration;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalGlanceRemoteViewsApi
@SourceDebugExtension({"SMAP\nGlanceRemoteViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceRemoteViews.kt\nandroidx/glance/appwidget/GlanceRemoteViews\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,128:1\n107#2,10:129\n*S KotlinDebug\n*F\n+ 1 GlanceRemoteViews.kt\nandroidx/glance/appwidget/GlanceRemoteViews\n*L\n121#1:129,10\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceRemoteViews {
    public static final int $stable = 8;
    private LayoutConfiguration layoutConfiguration;
    private final a mutex = d.a();

    /* renamed from: compose-YuIfr8w$default, reason: not valid java name */
    public static /* synthetic */ Object m1308composeYuIfr8w$default(GlanceRemoteViews glanceRemoteViews, Context context, long j, Object obj, Bundle bundle, Function2 function2, Continuation continuation, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        Object obj3 = obj;
        if ((i & 8) != 0) {
            bundle = new Bundle();
        }
        return glanceRemoteViews.m1309composeYuIfr8w(context, j, obj3, bundle, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x0059, B:14:0x005d, B:15:0x0067), top: B:11:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeLayoutConfiguration(Context context, Continuation<? super LayoutConfiguration> continuation) {
        GlanceRemoteViews$initializeLayoutConfiguration$1 glanceRemoteViews$initializeLayoutConfiguration$1;
        int i;
        a aVar;
        GlanceRemoteViews glanceRemoteViews;
        LayoutConfiguration layoutConfiguration;
        try {
            if (continuation instanceof GlanceRemoteViews$initializeLayoutConfiguration$1) {
                glanceRemoteViews$initializeLayoutConfiguration$1 = (GlanceRemoteViews$initializeLayoutConfiguration$1) continuation;
                int i2 = glanceRemoteViews$initializeLayoutConfiguration$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    glanceRemoteViews$initializeLayoutConfiguration$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = glanceRemoteViews$initializeLayoutConfiguration$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = glanceRemoteViews$initializeLayoutConfiguration$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        LayoutConfiguration layoutConfiguration2 = this.layoutConfiguration;
                        if (layoutConfiguration2 != null) {
                            return layoutConfiguration2;
                        }
                        aVar = this.mutex;
                        glanceRemoteViews$initializeLayoutConfiguration$1.L$0 = this;
                        glanceRemoteViews$initializeLayoutConfiguration$1.L$1 = context;
                        glanceRemoteViews$initializeLayoutConfiguration$1.L$2 = aVar;
                        glanceRemoteViews$initializeLayoutConfiguration$1.label = 1;
                        if (aVar.d(glanceRemoteViews$initializeLayoutConfiguration$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        glanceRemoteViews = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar2 = (a) glanceRemoteViews$initializeLayoutConfiguration$1.L$2;
                        Context context2 = (Context) glanceRemoteViews$initializeLayoutConfiguration$1.L$1;
                        glanceRemoteViews = (GlanceRemoteViews) glanceRemoteViews$initializeLayoutConfiguration$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar2;
                        context = context2;
                    }
                    layoutConfiguration = glanceRemoteViews.layoutConfiguration;
                    if (layoutConfiguration == null) {
                        layoutConfiguration = LayoutConfiguration.INSTANCE.create$glance_appwidget_release(context, 0);
                    }
                    glanceRemoteViews.layoutConfiguration = layoutConfiguration;
                    Intrinsics.checkNotNull(layoutConfiguration);
                    aVar.c(null);
                    return layoutConfiguration;
                }
            }
            layoutConfiguration = glanceRemoteViews.layoutConfiguration;
            if (layoutConfiguration == null) {
            }
            glanceRemoteViews.layoutConfiguration = layoutConfiguration;
            Intrinsics.checkNotNull(layoutConfiguration);
            aVar.c(null);
            return layoutConfiguration;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
        glanceRemoteViews$initializeLayoutConfiguration$1 = new GlanceRemoteViews$initializeLayoutConfiguration$1(this, continuation);
        Object obj2 = glanceRemoteViews$initializeLayoutConfiguration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceRemoteViews$initializeLayoutConfiguration$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compose-YuIfr8w, reason: not valid java name */
    public final Object m1309composeYuIfr8w(Context context, long j, Object obj, Bundle bundle, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super RemoteViewsCompositionResult> continuation) {
        return C1082i.f(new GlanceRemoteViews$compose$2(this, context, j, obj, bundle, function2, null), new BroadcastFrameClock(null, 1, 0 == true ? 1 : 0), continuation);
    }
}

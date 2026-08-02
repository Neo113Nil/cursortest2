package com.bbflight.background_downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationManagerCompat;
import androidx.preference.PreferenceManager;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.BDPlugin;
import com.bbflight.background_downloader.TaskWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.serialization.json.b;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbflight/background_downloader/NotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationReceiver extends BroadcastReceiver {
    public static final String actionCancelActive = "com.bbflight.background_downloader.cancelActive";
    public static final String actionCancelInactive = "com.bbflight.background_downloader.cancelInactive";
    public static final String actionPause = "com.bbflight.background_downloader.pause";
    public static final String actionResume = "com.bbflight.background_downloader.resume";
    public static final String actionTap = "com.bbflight.background_downloader.tap";
    public static final String keyBundle = "com.bbflight.background_downloader.bundle";
    public static final String keyGroupNotificationName = "com.bbflight.background_downloader.groupNotificationName";
    public static final String keyNotificationConfig = "com.bbflight.background_downloader.notificationConfig";
    public static final String keyNotificationId = "com.bbflight.background_downloader.notificationId";
    public static final String keyNotificationType = "com.bbflight.background_downloader.notificationType";
    public static final String keyTask = "com.bbflight.background_downloader.task";
    public static final String keyTaskId = "com.bbflight.background_downloader.taskId";

    @DebugMetadata(c = "com.bbflight.background_downloader.NotificationReceiver$onReceive$1", f = "Notifications.kt", i = {1, 1, 2, 2, 3, 3, 4, 4, 5}, l = {191, 200, 220, 228, 233, 238}, m = "invokeSuspend", n = {"taskJsonString", "task", "resumeData", "notificationConfigJsonString", "resumeData", "notificationConfigJsonString", "resumeData", "notificationConfigJsonString", "resumeData"}, nl = {197, ComposerKt.providerKey, 227, 230, 238, 245}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, v = 2)
    @SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationReceiver$onReceive$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,960:1\n96#2:961\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationReceiver$onReceive$1\n*L\n199#1:961\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Object>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ Intent d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Bundle i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, Context context, String str, Bundle bundle, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = intent;
            this.e = context;
            this.f = str;
            this.i = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.d, this.e, this.f, this.i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Object> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ec, code lost:
        
            if (r0.g(r2, r12) == r8) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        
            if (r0 == r8) goto L67;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M0 m0;
            String string;
            Object e;
            E0 e0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            Context context = this.e;
            String taskId = this.f;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    String action = this.d.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        Bundle bundle = this.i;
                        switch (hashCode) {
                            case -1549397763:
                                if (action.equals(NotificationReceiver.actionPause)) {
                                    BDPlugin.INSTANCE.getClass();
                                    Intrinsics.checkNotNullParameter(taskId, "taskId");
                                    BDPlugin.p.add(taskId);
                                    return Boxing.boxBoolean(true);
                                }
                                break;
                            case -1333239330:
                                if (action.equals(NotificationReceiver.actionCancelInactive)) {
                                    String string2 = bundle.getString(NotificationReceiver.keyTask);
                                    if (string2 == null) {
                                        return Boxing.boxInt(Log.d("BackgroundDownloader", "task was null"));
                                    }
                                    b.a aVar = kotlinx.serialization.json.b.d;
                                    aVar.getClass();
                                    M0 m02 = (M0) aVar.a(M0.Companion.serializer(), string2);
                                    BDPlugin.Companion companion = BDPlugin.INSTANCE;
                                    this.a = SpillingKt.nullOutSpilledVariable(string2);
                                    this.b = m02;
                                    this.c = 2;
                                    companion.getClass();
                                    Context context2 = this.e;
                                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                                    TaskWorker.Companion companion2 = TaskWorker.INSTANCE;
                                    W0 w0 = W0.i;
                                    Intrinsics.checkNotNull(defaultSharedPreferences);
                                    Object g = TaskWorker.Companion.g(companion2, m02, w0, defaultSharedPreferences, null, context2, this, 504);
                                    if (g != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        g = Unit.INSTANCE;
                                    }
                                    if (g != coroutine_suspended) {
                                        m0 = m02;
                                        NotificationManagerCompat.from(context).cancel(m0.a.hashCode());
                                        return Unit.INSTANCE;
                                    }
                                }
                                break;
                            case -725795322:
                                if (action.equals(NotificationReceiver.actionResume)) {
                                    BDPlugin.Companion companion3 = BDPlugin.INSTANCE;
                                    companion3.getClass();
                                    E0 e02 = (E0) BDPlugin.n.get(taskId);
                                    if (e02 != null) {
                                        string = bundle.getString(NotificationReceiver.keyNotificationConfig);
                                        if (string != null) {
                                            M0 m03 = e02.a;
                                            this.a = e02;
                                            this.b = SpillingKt.nullOutSpilledVariable(string);
                                            this.c = 3;
                                            e = BDPlugin.Companion.e(companion3, this.e, m03, string, e02, null, this, 48);
                                            e0 = e02;
                                            break;
                                        } else {
                                            WorkManager workManager = WorkManager.getInstance(context);
                                            Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                            this.a = SpillingKt.nullOutSpilledVariable(e02);
                                            this.b = SpillingKt.nullOutSpilledVariable(string);
                                            this.c = 5;
                                            Object b = companion3.b(context, taskId, workManager, this);
                                            if (b != coroutine_suspended) {
                                                return b;
                                            }
                                        }
                                    } else {
                                        WorkManager workManager2 = WorkManager.getInstance(context);
                                        Intrinsics.checkNotNullExpressionValue(workManager2, "getInstance(...)");
                                        this.a = SpillingKt.nullOutSpilledVariable(e02);
                                        this.c = 6;
                                        Object b2 = companion3.b(context, taskId, workManager2, this);
                                        if (b2 != coroutine_suspended) {
                                            return b2;
                                        }
                                    }
                                }
                                break;
                            case 1096303929:
                                if (action.equals(NotificationReceiver.actionCancelActive)) {
                                    BDPlugin.Companion companion4 = BDPlugin.INSTANCE;
                                    WorkManager workManager3 = WorkManager.getInstance(context);
                                    Intrinsics.checkNotNullExpressionValue(workManager3, "getInstance(...)");
                                    this.c = 1;
                                    Object b3 = companion4.b(context, taskId, workManager3, this);
                                    return b3 == coroutine_suspended ? coroutine_suspended : b3;
                                }
                                break;
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    return obj;
                case 2:
                    m0 = (M0) this.b;
                    ResultKt.throwOnFailure(obj);
                    NotificationManagerCompat.from(context).cancel(m0.a.hashCode());
                    return Unit.INSTANCE;
                case 3:
                    String str = (String) this.b;
                    e0 = (E0) this.a;
                    ResultKt.throwOnFailure(obj);
                    string = str;
                    e = obj;
                    if (((Boolean) e).booleanValue()) {
                        return Boxing.boxInt(Log.i("BackgroundDownloader", "Resumed taskId " + taskId + " from notification"));
                    }
                    BDPlugin.INSTANCE.getClass();
                    C0638c0 c0638c0 = BDPlugin.y;
                    if (c0638c0 == null) {
                        return null;
                    }
                    M0 m04 = e0.a;
                    this.a = SpillingKt.nullOutSpilledVariable(e0);
                    this.b = SpillingKt.nullOutSpilledVariable(string);
                    this.c = 4;
                    break;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.NotificationReceiver$onReceive$2", f = "Notifications.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, nl = {258}, s = {}, v = 2)
    @SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationReceiver$onReceive$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,960:1\n1586#2:961\n1661#2,3:962\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationReceiver$onReceive$2\n*L\n258#1:961\n258#1:962,3\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Z c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, Z z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Boolean> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int collectionSizeOrDefault;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            BDPlugin.Companion companion = BDPlugin.INSTANCE;
            Set<M0> c = this.c.c();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(((M0) it.next()).a);
            }
            this.a = 1;
            Object c2 = companion.c(this.b, arrayList, this);
            return c2 == coroutine_suspended ? coroutine_suspended : c2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Z z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(keyBundle);
        String string = bundleExtra != null ? bundleExtra.getString(keyTaskId) : null;
        if (string != null) {
            C1082i.d(EmptyCoroutineContext.INSTANCE, new b(intent, context, string, bundleExtra, null));
            return;
        }
        String string2 = bundleExtra != null ? bundleExtra.getString(keyGroupNotificationName) : null;
        if (string2 == null || (z = C0657m0.b.get(string2)) == null) {
            return;
        }
        C1082i.d(EmptyCoroutineContext.INSTANCE, new c(context, z, null));
    }
}

package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0012\u0013\u0014"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "activity", "", "getHasSavedInstanceStateBundle", "()Z", "hasSavedInstanceStateBundle", "Lcom/datadog/android/rum/internal/domain/Time;", "getInitialTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "initialTime", "Cold", "WarmAfterActivityDestroyed", "WarmFirstActivity", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario$Cold;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario$WarmAfterActivityDestroyed;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario$WarmFirstActivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumStartupScenario {
    java.lang.ref.WeakReference<android.app.Activity> getActivity();

    boolean getHasSavedInstanceStateBundle();

    com.datadog.android.rum.internal.domain.Time getInitialTime();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumStartupScenario$Cold;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "", "hasSavedInstanceStateBundle", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "", "appStartActivityOnCreateGapNs", "Lcom/datadog/android/rum/internal/domain/Time;", "initialTime", "<init>", "(ZLjava/lang/ref/WeakReference;JLcom/datadog/android/rum/internal/domain/Time;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "J", "getAppStartActivityOnCreateGapNs", "()J", "Z", "getHasSavedInstanceStateBundle", "()Z", "Lcom/datadog/android/rum/internal/domain/Time;", "getInitialTime", "()Lcom/datadog/android/rum/internal/domain/Time;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cold implements com.datadog.android.rum.internal.startup.RumStartupScenario {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;
        private final long appStartActivityOnCreateGapNs;
        private final boolean hasSavedInstanceStateBundle;
        private final com.datadog.android.rum.internal.domain.Time initialTime;

        public Cold(boolean z, java.lang.ref.WeakReference<android.app.Activity> weakReference, long j, com.datadog.android.rum.internal.domain.Time time) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.appStartActivityOnCreateGapNs = j;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }

        public final long getAppStartActivityOnCreateGapNs() {
            return this.appStartActivityOnCreateGapNs;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final com.datadog.android.rum.internal.domain.Time getInitialTime() {
            return this.initialTime;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumStartupScenario$WarmFirstActivity;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "", "hasSavedInstanceStateBundle", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "", "appStartActivityOnCreateGapNs", "Lcom/datadog/android/rum/internal/domain/Time;", "initialTime", "<init>", "(ZLjava/lang/ref/WeakReference;JLcom/datadog/android/rum/internal/domain/Time;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "J", "getAppStartActivityOnCreateGapNs", "()J", "Z", "getHasSavedInstanceStateBundle", "()Z", "Lcom/datadog/android/rum/internal/domain/Time;", "getInitialTime", "()Lcom/datadog/android/rum/internal/domain/Time;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WarmFirstActivity implements com.datadog.android.rum.internal.startup.RumStartupScenario {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;
        private final long appStartActivityOnCreateGapNs;
        private final boolean hasSavedInstanceStateBundle;
        private final com.datadog.android.rum.internal.domain.Time initialTime;

        public WarmFirstActivity(boolean z, java.lang.ref.WeakReference<android.app.Activity> weakReference, long j, com.datadog.android.rum.internal.domain.Time time) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.appStartActivityOnCreateGapNs = j;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }

        public final long getAppStartActivityOnCreateGapNs() {
            return this.appStartActivityOnCreateGapNs;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final com.datadog.android.rum.internal.domain.Time getInitialTime() {
            return this.initialTime;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumStartupScenario$WarmAfterActivityDestroyed;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "", "hasSavedInstanceStateBundle", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lcom/datadog/android/rum/internal/domain/Time;", "initialTime", "<init>", "(ZLjava/lang/ref/WeakReference;Lcom/datadog/android/rum/internal/domain/Time;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "Z", "getHasSavedInstanceStateBundle", "()Z", "Lcom/datadog/android/rum/internal/domain/Time;", "getInitialTime", "()Lcom/datadog/android/rum/internal/domain/Time;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WarmAfterActivityDestroyed implements com.datadog.android.rum.internal.startup.RumStartupScenario {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;
        private final boolean hasSavedInstanceStateBundle;
        private final com.datadog.android.rum.internal.domain.Time initialTime;

        public WarmAfterActivityDestroyed(boolean z, java.lang.ref.WeakReference<android.app.Activity> weakReference, com.datadog.android.rum.internal.domain.Time time) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final com.datadog.android.rum.internal.domain.Time getInitialTime() {
            return this.initialTime;
        }
    }
}

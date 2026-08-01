package com.chartboost.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.d4;
import com.chartboost.sdk.impl.e7;
import com.chartboost.sdk.impl.i5;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.ta;
import com.chartboost.sdk.impl.x3;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0005H\u0007J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0007J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/chartboost/sdk/Chartboost;", "", "<init>", "()V", "INSTANCE_ID_KEY", "", "instanceId", "startWithAppId", "", "context", "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.APP_ID, "appSignature", "onStarted", "Lcom/chartboost/sdk/callbacks/StartCallback;", "addDataUseConsent", "dataUseConsent", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "getDataUseConsent", "privacyStandard", "clearDataUseConsent", "isSdkStarted", "", "setLoggingLevel", "level", "Lcom/chartboost/sdk/LoggingLevel;", "getSDKVersion", "getBidderToken", "getInstanceId", "getInstanceId$ChartboostMonetization_9_13_0_release", "initContainer", "loadInstanceId", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Chartboost {
    public static final Chartboost INSTANCE = new Chartboost();
    private static final String INSTANCE_ID_KEY = "ChartboostInstanceId";
    private static String instanceId;

    private Chartboost() {
    }

    @JvmStatic
    public static final void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataUseConsent, "dataUseConsent");
        INSTANCE.initContainer(context);
        if (d4.b.d()) {
            b4.b.h().a().a(dataUseConsent);
        }
    }

    @JvmStatic
    public static final void clearDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        if (d4.b.d()) {
            b4.b.h().a().b(privacyStandard);
        }
    }

    @JvmStatic
    public static final String getBidderToken() {
        if (isSdkStarted()) {
            return b4.b.j().a().a();
        }
        mb.b("Chartboost getBidderToken failed due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
        return null;
    }

    @JvmStatic
    public static final DataUseConsent getDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        if (d4.b.d()) {
            return b4.b.h().a().a(privacyStandard);
        }
        return null;
    }

    @JvmStatic
    public static final String getSDKVersion() {
        return "9.13.0";
    }

    private final void initContainer(final Context context) {
        d4 d4Var = d4.b;
        if (d4Var.d()) {
            return;
        }
        d4Var.a(context);
        b4.b.e().b().execute(new Runnable() { // from class: com.chartboost.sdk.Chartboost$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Chartboost.initContainer$lambda$1(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContainer$lambda$1(Context context) {
        INSTANCE.loadInstanceId(context);
    }

    @JvmStatic
    public static final boolean isSdkStarted() {
        d4 d4Var = d4.b;
        if (!d4Var.d() || !d4Var.e()) {
            return false;
        }
        try {
            return b4.b.j().c().a();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void loadInstanceId(Context context) {
        synchronized (this) {
            if (instanceId == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
                String string = sharedPreferences.getString(INSTANCE_ID_KEY, null);
                if (string == null || string.length() == 0) {
                    string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNull(sharedPreferences);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(INSTANCE_ID_KEY, string);
                    edit.apply();
                }
                instanceId = string;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void setLoggingLevel(LoggingLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        mb.b = level;
    }

    @JvmStatic
    public static final synchronized void startWithAppId(Context context, String appId, String appSignature, StartCallback onStarted) {
        synchronized (Chartboost.class) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(appSignature, "appSignature");
            Intrinsics.checkNotNullParameter(onStarted, "onStarted");
            if (isSdkStarted()) {
                mb.c("Chartboost startWithAppId skipped due to SDK already being initialized. This method only needs to be called once per app session.", null, 2, null);
                onStarted.onStartCompleted(null);
                return;
            }
            INSTANCE.initContainer(context);
            Object a2 = new ta().a();
            if (Result.m8085isFailureimpl(a2)) {
                Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                ChartboostError chartboostError = m8082exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8082exceptionOrNullimpl : null;
                if (chartboostError == null) {
                    chartboostError = new ChartboostError.Initialization.Unknown("Precondition check failed.", null);
                }
                mb.b("Chartboost startWithAppId failed due to preconditions not being met. Check the logs for more information.", (Throwable) null, 2, (Object) null);
                b4.b.j().a().a(appId, appSignature, onStarted, chartboostError);
                return;
            }
            i5.f4802a.a(context);
            d4 d4Var = d4.b;
            if (!d4Var.d()) {
                b4.b.j().a().a(appId, appSignature, onStarted, new ChartboostError.Initialization.Internal("Dependency Injection container not initialized.", null));
                return;
            }
            if (!isSdkStarted()) {
                d4Var.a(appId, appSignature);
                e7 e7Var = e7.f4748a;
                b4 b4Var = b4.b;
                e7Var.a(b4Var.a().j(), b4Var.a().k());
            }
            b4 b4Var2 = b4.b;
            b4Var2.e().b().execute(new Runnable() { // from class: com.chartboost.sdk.Chartboost$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Chartboost.startWithAppId$lambda$0();
                }
            });
            x3.a(b4Var2.j().a(), appId, appSignature, onStarted, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWithAppId$lambda$0() {
        b4.b.c().a();
    }
}

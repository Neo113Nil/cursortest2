package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzhu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzio;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes5.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private PendingPurchasesParams zzE;
    private boolean zzF;
    private boolean zzG;
    private volatile BillingClientStateListener zzH;
    private ExecutorService zzI;
    private final Long zzJ;
    private com.google.android.gms.internal.play_billing.zzbo zzK;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final String zzd;
    private final Handler zze;
    private volatile zzab zzf;
    private Context zzg;
    private zzcz zzh;
    private volatile com.google.android.gms.internal.play_billing.zzap zzi;
    private volatile zzbw zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str, BillingClient.Builder builder) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzci(), str, null, null, null, null, null, builder);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzb zzbVar, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(this.zzJ.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, zzbVar, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = zzbVar != null;
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbo zzboVar = builder.zzb;
        this.zzF = builder.zza;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        startConnection(new zzci(j));
    }

    public static /* synthetic */ Void zzA(BillingClientImpl billingClientImpl, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaL(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzB(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        billingClientImpl.zzaK(externalOfferAvailabilityListener);
        return null;
    }

    public static /* synthetic */ Void zzC(BillingClientImpl billingClientImpl, BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i) {
        billingClientImpl.zzaJ(billingProgramAvailabilityListener, i);
        return null;
    }

    public static /* synthetic */ Void zzD(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener, LaunchExternalLinkParams launchExternalLinkParams, Activity activity) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!billingClientImpl.zzbl(30000L)) {
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (billingClientImpl.zzD) {
                synchronized (billingClientImpl.zza) {
                    zzapVar = billingClientImpl.zzi;
                }
                if (zzapVar == null) {
                    billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = billingClientImpl.zzg.getPackageName();
                    String str = billingClientImpl.zzc;
                    String str2 = billingClientImpl.zzd;
                    long longValue = billingClientImpl.zzJ.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    zzhu zza = zzhx.zza();
                    zzio zza2 = zziq.zza();
                    zza2.zza(launchExternalLinkParams.getLinkUri().toString());
                    zza.zza("externalOfferUri", (zziq) zza2.zzi());
                    zzio zza3 = zziq.zza();
                    zza3.zza(String.valueOf(launchExternalLinkParams.getLaunchMode()));
                    zza.zza("externalOfferLaunchMode", (zziq) zza3.zzi());
                    zzio zza4 = zziq.zza();
                    zza4.zza(String.valueOf(launchExternalLinkParams.getLinkType()));
                    zza.zza("externalOfferLinkType", (zziq) zza4.zzi());
                    zzio zza5 = zziq.zza();
                    zza5.zza(String.valueOf(launchExternalLinkParams.getBillingProgram()));
                    zza.zza("externalOfferBillingProgram", (zziq) zza5.zzi());
                    bundle.putByteArray("REQUEST_PARAMS", ((zzhx) zza.zzi()).zzQ());
                    zzapVar.zzp(27, packageName, bundle, new zzcc(billingClientImpl, new WeakReference(activity), launchExternalLinkResponseListener, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support launch external link.");
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzG, zzjd.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
            }
        } catch (RuntimeException e) {
            billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e);
        }
        return null;
    }

    public static /* synthetic */ Void zzE(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        billingClientImpl.zzaH(externalOfferReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzF(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaM(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzG(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        billingClientImpl.zzaF(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzH(BillingClientImpl billingClientImpl, BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) {
        billingClientImpl.zzaG(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
        return null;
    }

    public static /* synthetic */ Void zzI(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        billingClientImpl.zzaI(alternativeBillingOnlyAvailabilityListener);
        return null;
    }

    static Future zzK(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaz
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static /* synthetic */ void zzL(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzM(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbw.zzk());
    }

    public static /* synthetic */ void zzN(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* synthetic */ void zzR(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* synthetic */ void zzT(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
    }

    public static /* synthetic */ void zzV(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        if (billingClientImpl.zzf.zzf() != null) {
            billingClientImpl.zzf.zzf().onPurchasesUpdated(billingResult, null);
        } else {
            zzab zzabVar = billingClientImpl.zzf;
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final /* synthetic */ Object zzaA(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            if (!zzbl(30000L)) {
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid purchase token.");
                zzjd zzjdVar2 = zzjd.EMPTY_PURCHASE_TOKEN;
                BillingResult billingResult2 = zzdc.zzg;
                zzbs(zzjdVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.zzp) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar != null) {
                    String packageName = this.zzg.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    Bundle zzd = zzapVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzdc.zza(com.google.android.gms.internal.play_billing.zzc.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzk(zzd, "BillingClient")));
                    return null;
                }
                zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzjd zzjdVar3 = zzjd.API_VERSION_NOT_V9;
                BillingResult billingResult3 = zzdc.zza;
                zzbs(zzjdVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (DeadObjectException e) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e);
            return null;
        } catch (Exception e2) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzh, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e2);
            return null;
        }
    }

    private final /* synthetic */ Object zzaB(BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.zzv) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    zzapVar.zzo(18, packageName, bundle, new zzca(billingConfigResponseListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support get billing config.");
                zzjd zzjdVar2 = zzjd.GET_BILLING_CONFIG_NOT_SUPPORTED;
                BillingResult billingResult2 = zzdc.zzy;
                zzbs(zzjdVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (DeadObjectException e) {
            zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaY(billingConfigResponseListener, zzdc.zzh, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Object zzaC(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzbb(-1, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzs(12, this.zzg.getPackageName(), bundle, new zzcf(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzbb(-1, zzjd.SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzbb(6, zzjd.SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final String zzaD(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    private static String zzaE() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final /* synthetic */ Void zzaF(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbx(alternativeBillingOnlyReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzh, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaG(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            if (!zzbl(30000L)) {
                zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzD) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String str = this.zzc;
                    com.google.android.gms.internal.play_billing.zzdy zzb = zzdg.zzb(str, 24, this.zzg, zzdf.CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC.zza());
                    zzhu zza = zzhx.zza();
                    zzio zza2 = zziq.zza();
                    zza2.zza(str);
                    zza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zza2.zzi());
                    zzio zza3 = zziq.zza();
                    zza3.zza(this.zzg.getPackageName());
                    zza.zza("CALLING_PACKAGE", (zziq) zza3.zzi());
                    zzio zza4 = zziq.zza();
                    zza4.zza(String.valueOf(billingProgramReportingDetailsParams.getBillingProgram()));
                    zza.zza("BILLING_PROGRAM", (zziq) zza4.zzi());
                    zzio zza5 = zziq.zza();
                    zza5.zza("RESPONSE_FORMAT_PROTO");
                    zza.zza("RESPONSE_FORMAT", (zziq) zza5.zzi());
                    if (billingProgramReportingDetailsParams.getBillingProgram() == 3) {
                        zzio zza6 = zziq.zza();
                        zza6.zza(String.valueOf(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime));
                        zza.zza("APP_INSTALL_TIME_MILLIS", (zziq) zza6.zzi());
                    }
                    zzapVar.zzm(zzdg.zza(zzb, (zzhx) zza.zzi()), new CreateBillingProgramReportingDetailsDelegateToBackendCallback(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams.getBillingProgram(), this.zzh, this.zzm, zzav(), zzJ()));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                zzaU(billingProgramReportingDetailsListener, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e) {
            zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CALL_EXCEPTION, e);
        } catch (RuntimeException e2) {
            zzaU(billingProgramReportingDetailsListener, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaH(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzz) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    long j = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    bundle.putLong("appInstallTimeMillis", j);
                    zzapVar.zzl(22, packageName, bundle, new zzby(externalOfferReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaV(externalOfferReportingDetailsListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzh, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaI(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzq(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcd(alternativeBillingOnlyAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzh, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaJ(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            if (!zzbl(30000L)) {
                zzaR(billingProgramAvailabilityListener, i, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
                return null;
            }
            if (!this.zzD) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                zzaR(billingProgramAvailabilityListener, i, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
                return null;
            }
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzaR(billingProgramAvailabilityListener, i, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                return null;
            }
            String str = this.zzc;
            com.google.android.gms.internal.play_billing.zzdy zzb = zzdg.zzb(str, 24, this.zzg, zzdf.IS_BILLING_PROGRAM_AVAILABLE_ASYNC.zza());
            zzhu zza = zzhx.zza();
            zzio zza2 = zziq.zza();
            zza2.zza(str);
            zza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zza2.zzi());
            zzio zza3 = zziq.zza();
            zza3.zza(this.zzg.getPackageName());
            zza.zza("CALLING_PACKAGE", (zziq) zza3.zzi());
            zzio zza4 = zziq.zza();
            zza4.zza(String.valueOf(i));
            zza.zza("BILLING_PROGRAM", (zziq) zza4.zzi());
            zzapVar.zzm(zzdg.zza(zzb, (zzhx) zza.zzi()), new IsBillingProgramAvailableDelegateToBackendCallback(billingProgramAvailabilityListener, i, this.zzh, this.zzm, zzav(), zzJ()));
            return null;
        } catch (DeadObjectException e) {
            zzaR(billingProgramAvailabilityListener, i, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
            return null;
        } catch (Exception e2) {
            zzaR(billingProgramAvailabilityListener, i, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e2);
            return null;
        }
    }

    private final /* synthetic */ Void zzaK(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzB) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzr(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzce(externalOfferAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaW(externalOfferAvailabilityListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzh, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaL(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzn(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbz(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzh, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ Void zzaM(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzp(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcb(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e);
        } catch (Exception e2) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzh, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final Future zzaN(Callable callable, long j, final Runnable runnable, Handler handler) throws Exception {
        try {
            final Future submit = zzJ().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    runnable2.run();
                }
            }, 28500L);
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e);
            throw e;
        }
    }

    private final void zzaO(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                return;
            }
            if (this.zzp) {
                String packageName = this.zzg.getPackageName();
                boolean z = this.zzp;
                String str2 = this.zzc;
                String str3 = this.zzd;
                long longValue = this.zzJ.longValue();
                Bundle bundle = new Bundle();
                if (z) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str3, longValue);
                }
                Bundle zze = zzapVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzc.zzk(zze, "BillingClient");
            } else {
                zza = zzapVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzdc.zza(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            } else {
                zzaS(consumeResponseListener, purchaseToken, zza2, zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + zza, null);
            }
        } catch (DeadObjectException e) {
            zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
        } catch (Exception e2) {
            zzaS(consumeResponseListener, purchaseToken, zzdc.zzh, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e2);
        }
    }

    private final void zzaP(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error in acknowledge purchase!", exc);
        zzbu(zzjdVar, 3, billingResult, zzcy.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 14, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 33, billingResult, zzcy.zza(exc));
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i));
    }

    private final void zzaS(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzjd zzjdVar, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str2, exc);
        zzbu(zzjdVar, 4, billingResult, zzcy.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 15, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaU(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 35, billingResult, zzcy.zza(exc));
        billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 24, billingResult, zzcy.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaW(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 23, billingResult, zzcy.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaX(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 25, billingResult, zzcy.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzaY(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "getBillingConfig got an exception.", exc);
        zzbu(zzjdVar, 13, billingResult, zzcy.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ(LaunchExternalLinkResponseListener launchExternalLinkResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 37, billingResult, zzcy.zza(exc));
        launchExternalLinkResponseListener.onLaunchExternalLinkResponse(billingResult);
    }

    static /* bridge */ /* synthetic */ void zzak(BillingClientImpl billingClientImpl, int i) {
        billingClientImpl.zzm = i;
        billingClientImpl.zzD = i >= 27;
        billingClientImpl.zzC = i >= 26;
        billingClientImpl.zzB = i >= 24;
        billingClientImpl.zzA = i >= 23;
        billingClientImpl.zzz = i >= 22;
        billingClientImpl.zzy = i >= 21;
        billingClientImpl.zzx = i >= 20;
        billingClientImpl.zzw = i >= 19;
        billingClientImpl.zzv = i >= 18;
        billingClientImpl.zzu = i >= 17;
        billingClientImpl.zzt = i >= 16;
        billingClientImpl.zzs = i >= 15;
        billingClientImpl.zzr = i >= 14;
        billingClientImpl.zzq = i >= 12;
        billingClientImpl.zzp = i >= 9;
        billingClientImpl.zzo = i >= 8;
        billingClientImpl.zzn = i >= 6;
    }

    static /* bridge */ /* synthetic */ void zzam(BillingClientImpl billingClientImpl, int i) {
        if (i != 0) {
            billingClientImpl.zzbg(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            billingClientImpl.zzbg(2);
            zzab zzabVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
            if (zzabVar != null) {
                zzabVar.zzi(billingClientImpl.zzy);
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzaq(BillingClientImpl billingClientImpl) {
        boolean z;
        synchronized (billingClientImpl.zza) {
            z = true;
            if (billingClientImpl.zzb != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzat(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzg(i, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzau(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzav() {
        return Looper.myLooper() == null ? this.zze : new Handler(Looper.myLooper());
    }

    private final zzcg zzaw(BillingResult billingResult, zzjd zzjdVar, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        zzbu(zzjdVar, 7, billingResult, zzcy.zza(exc));
        return new zzcg(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    private final BillingResult zzax(int i) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
        zziy zza = zzja.zza();
        zza.zze(6);
        zzks zza2 = zzku.zza();
        zza2.zze(true);
        zza2.zza(i > 0);
        zza2.zzb(i);
        zza.zzd(zza2);
        zzbe((zzja) zza.zzi());
        return zzdc.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzay() {
        BillingResult billingResult;
        int i = 0;
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            while (true) {
                if (i >= 2) {
                    billingResult = zzdc.zzh;
                    break;
                }
                if (this.zzb == iArr[i]) {
                    billingResult = zzdc.zzj;
                    break;
                }
                i++;
            }
        }
        return billingResult;
    }

    private final com.google.android.gms.internal.play_billing.zzdc zzaz(final int i) {
        if (this.zzF && !zzbm()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzad
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return BillingClientImpl.zzr(BillingClientImpl.this, i, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcx.zza(zzdc.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 16, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbb(int i, zzjd zzjdVar, Exception exc) {
        zziw zziwVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "showInAppMessages error.", exc);
        zzcz zzczVar = this.zzh;
        String zza = zzcy.zza(exc);
        try {
            zzjb zza2 = zzjf.zza();
            zza2.zzp(i);
            if (zzjdVar != null) {
                zza2.zze(zzjdVar);
            }
            if (zza != null) {
                zza2.zza(zza);
            }
            zziu zza3 = zziw.zza();
            zza3.zzb(zza2);
            zza3.zzp(30);
            zziwVar = (zziw) zza3.zzi();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th);
            zziwVar = null;
        }
        zzczVar.zza(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(zziw zziwVar) {
        try {
            this.zzh.zzb(zziwVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbd(zziw zziwVar, long j, boolean z) {
        try {
            this.zzh.zze(zziwVar, this.zzm, j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbe(zzja zzjaVar) {
        try {
            this.zzh.zzg(zzjaVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(zzjd zzjdVar, BillingResult billingResult, int i) {
        try {
            int i2 = zzcy.zza;
            zziu zziuVar = (zziu) zzcy.zzb(zzjdVar, 6, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED).zzq();
            zzks zza = zzku.zza();
            zza.zza(i > 0);
            zza.zzb(i);
            zziuVar.zze(zza);
            zzbc((zziw) zziuVar.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbg(int i) {
        synchronized (this.zza) {
            if (this.zzb == 3) {
                return;
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Setting clientState from " + zzbn(this.zzb) + " to " + zzbn(i));
            this.zzb = i;
        }
    }

    private final synchronized void zzbh() {
        ExecutorService executorService = this.zzI;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzI = null;
        }
    }

    private final void zzbi(BillingClientStateListener billingClientStateListener, int i) {
        zzjd zzjdVar;
        BillingResult billingResult;
        BillingResult billingResult2;
        synchronized (this.zza) {
            if (zzbm()) {
                billingResult = zzax(i);
            } else {
                if (this.zzb == 1) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
                    zzjd zzjdVar2 = zzjd.BILLING_CLIENT_CONNECTING;
                    billingResult2 = zzdc.zzd;
                    zzbf(zzjdVar2, billingResult2, i);
                } else if (this.zzb == 3) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    zzjd zzjdVar3 = zzjd.BILLING_CLIENT_CLOSED;
                    billingResult2 = zzdc.zzj;
                    zzbf(zzjdVar3, billingResult2, i);
                } else {
                    zzbg(1);
                    if (i == 0) {
                        this.zzH = billingClientStateListener;
                        i = 0;
                    }
                    zzbj();
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Starting in-app billing setup.");
                    this.zzj = new zzbw(this, billingClientStateListener, i, null);
                    this.zzj.zzc();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
                    } else {
                        ResolveInfo resolveInfo = queryIntentServices.get(0);
                        if (resolveInfo.serviceInfo != null) {
                            String str = resolveInfo.serviceInfo.packageName;
                            String str2 = resolveInfo.serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                synchronized (this.zza) {
                                    if (this.zzb == 2) {
                                        billingResult = zzax(i);
                                    } else if (this.zzb != 1) {
                                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        zzjd zzjdVar4 = zzjd.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                        billingResult2 = zzdc.zzj;
                                        zzbf(zzjdVar4, billingResult2, i);
                                    } else {
                                        zzbw zzbwVar = this.zzj;
                                        if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbwVar, 1) : this.zzg.bindService(intent2, 1, zzJ(), zzbwVar)) {
                                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service was bonded successfully.");
                                            billingResult = null;
                                        } else {
                                            zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Connection to Billing service is blocked.");
                                        }
                                    }
                                }
                            }
                        } else {
                            zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    zzbg(0);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service unavailable on device.");
                    BillingResult billingResult3 = zzdc.zzb;
                    zzbf(zzjdVar, billingResult3, i);
                    billingResult = billingResult3;
                }
                billingResult = billingResult2;
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzbj() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzi = null;
                        this.zzj = null;
                    } finally {
                        this.zzi = null;
                        this.zzj = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzbk(long j) {
        try {
            BillingResult billingResult = (BillingResult) zzaz(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e);
        }
        return zzbm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzbl(long j) {
        long max;
        com.google.android.gms.internal.play_billing.zzbl zzb = com.google.android.gms.internal.play_billing.zzbl.zzb(this.zzK);
        long j2 = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                max = Math.max(0L, j2);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (max <= 0) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No time remaining for reconnection attempt.");
                return zzbm();
            }
            BillingResult billingResult = (BillingResult) zzaz(i).get(max, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return zzbm();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            j2 = 30000 - zzb.zza(TimeUnit.MILLISECONDS);
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed due to timeout limit reached.");
                return zzbm();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = 30000 - zzb.zza(TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Max retries reached.");
        return zzbm();
    }

    private final boolean zzbm() {
        boolean z;
        synchronized (this.zza) {
            z = false;
            if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                z = true;
            }
        }
        return z;
    }

    private static final String zzbn(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private static final void zzbo(zzjp zzjpVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzjpVar.zzv((int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                zzjpVar.zzr(Build.BRAND);
                zzjpVar.zzu(Build.MODEL);
                zzjpVar.zzt(Build.MANUFACTURER);
                zzjpVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    private final zzdz zzbp(int i, BillingResult billingResult, zzjd zzjdVar, String str, Exception exc) {
        zzbu(zzjdVar, 9, billingResult, zzcy.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        return new zzdz(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzdz zzbq(String str, boolean z, int i) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int i2;
        int i3;
        Bundle zzi;
        zzjd zzjdVar;
        BillingResult billingResult;
        zzjd zzjdVar2;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z2 = this.zzp;
        boolean z3 = this.zzw;
        boolean isEnabledForOneTimeProducts = this.zzE.isEnabledForOneTimeProducts();
        boolean isEnabledForPrepaidPlans = this.zzE.isEnabledForPrepaidPlans();
        long longValue = this.zzJ.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, this.zzc, this.zzd, longValue);
        if (z2 && isEnabledForOneTimeProducts) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3 && isEnabledForPrepaidPlans) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String str2 = null;
        do {
            try {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    return zzbp(9, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z && !this.zzC) {
                    return zzbp(9, zzdc.zzw, zzjd.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (this.zzp) {
                    if (this.zzC) {
                        i3 = 26;
                    } else if (this.zzB) {
                        i3 = 24;
                    } else if (this.zzw) {
                        i3 = 19;
                    } else {
                        i2 = 9;
                        zzi = zzapVar.zzi(i2, this.zzg.getPackageName(), str, str2, bundle);
                    }
                    i2 = i3;
                    zzi = zzapVar.zzi(i2, this.zzg.getPackageName(), str, str2, bundle);
                } else {
                    zzi = zzapVar.zzh(3, this.zzg.getPackageName(), str, str2);
                }
                BillingResult billingResult2 = zzdc.zzh;
                if (zzi == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    zzjdVar = zzjd.NULL_OWNED_ITEMS_LIST;
                } else {
                    int zzb = com.google.android.gms.internal.play_billing.zzc.zzb(zzi, "BillingClient");
                    String zzk = com.google.android.gms.internal.play_billing.zzc.zzk(zzi, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzb);
                    newBuilder.setDebugMessage(zzk);
                    BillingResult build = newBuilder.build();
                    if (zzb != 0) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(zzb)));
                        zzjdVar2 = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                        billingResult = build;
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_SKUS_LIST;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_PURCHASES_LIST;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_SIGNATURES_LIST;
                        } else {
                            billingResult = zzdc.zzi;
                            zzjdVar2 = zzjd.REASON_UNSPECIFIED;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        zzjdVar = zzjd.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (billingResult == zzdc.zzi) {
                        return zzbp(9, billingResult, zzjdVar2, "Purchase bundle invalid", null);
                    }
                    ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z4 = false;
                    for (int i4 = 0; i4 < stringArrayList5.size(); i4++) {
                        String str3 = stringArrayList5.get(i4);
                        String str4 = stringArrayList6.get(i4);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "BUG: empty/null token!");
                                z4 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e) {
                            return zzbp(9, zzdc.zzh, zzjd.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e);
                        }
                    }
                    if (z4) {
                        zzbs(zzjd.EMPTY_PURCHASE_TOKEN, 9, billingResult2);
                    }
                    str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                }
                zzjdVar2 = zzjdVar;
                billingResult = billingResult2;
                if (billingResult == zzdc.zzi) {
                }
            } catch (DeadObjectException e2) {
                return zzbp(9, zzdc.zzj, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e2);
            } catch (Exception e3) {
                return zzbp(9, zzdc.zzh, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e3);
            }
        } while (!TextUtils.isEmpty(str2));
        return new zzdz(zzdc.zzi, arrayList);
    }

    private final void zzbr(BillingResult billingResult, zzjd zzjdVar, int i) {
        zzja zzjaVar = null;
        zziw zziwVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i2 = zzcy.zza;
            try {
                zziy zza = zzja.zza();
                zza.zze(5);
                zzjv zza2 = zzjy.zza();
                zza2.zza(i);
                zza.zzb((zzjy) zza2.zzi());
                zzjaVar = (zzja) zza.zzi();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e);
            }
            zzbe(zzjaVar);
            return;
        }
        int i3 = zzcy.zza;
        try {
            zziu zza3 = zziw.zza();
            zzjb zza4 = zzjf.zza();
            zza4.zzp(billingResult.getResponseCode());
            zza4.zzb(billingResult.getDebugMessage());
            zza4.zze(zzjdVar);
            zza3.zzb(zza4);
            zza3.zzp(5);
            zzjv zza5 = zzjy.zza();
            zza5.zza(i);
            zza3.zzc((zzjy) zza5.zzi());
            zziwVar = (zziw) zza3.zzi();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e2);
        }
        zzbc(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbs(zzjd zzjdVar, int i, BillingResult billingResult) {
        try {
            int i2 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbt(zzjd zzjdVar, int i, BillingResult billingResult, long j) {
        try {
            int i2 = zzcy.zza;
            try {
                this.zzh.zzc(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.zzm, j);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbu(zzjd zzjdVar, int i, BillingResult billingResult, String str) {
        try {
            int i2 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbv(zzjd zzjdVar, int i, BillingResult billingResult, long j, boolean z) {
        try {
            int i2 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbw(zzjd zzjdVar, int i, BillingResult billingResult, String str, long j, boolean z) {
        try {
            int i2 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private void zzbx(int i) {
        try {
            int i2 = zzcy.zza;
            zzbe(zzcy.zzc(i, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    static /* bridge */ /* synthetic */ ResultReceiver zzg(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        return new zzbt(billingClientImpl, billingClientImpl.zze, launchExternalLinkResponseListener);
    }

    static /* bridge */ /* synthetic */ BillingResult zzm(Exception exc) {
        return exc instanceof DeadObjectException ? zzdc.zzj : zzdc.zzh;
    }

    public static /* synthetic */ Object zzr(BillingClientImpl billingClientImpl, int i, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        billingClientImpl.zzbi(new zzbs(billingClientImpl, zzpVar), i);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object zzs(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        if (billingClientImpl.zzbl(30000L)) {
            billingClientImpl.zzaO(consumeParams, consumeResponseListener);
            return null;
        }
        zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
        BillingResult billingResult = zzdc.zzj;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Object zzt(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) {
        if (!billingClientImpl.zzbl(30000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            billingClientImpl.zzbs(zzjdVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            zzcg zzh = billingClientImpl.zzh(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(zzdc.zza(zzh.zza(), zzh.zzb()), new QueryProductDetailsResult(zzh.zzc(), zzh.zzd()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Querying product details is not supported.");
        zzjd zzjdVar2 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
        BillingResult billingResult2 = zzdc.zzr;
        billingClientImpl.zzbs(zzjdVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        return null;
    }

    public static /* synthetic */ Object zzu(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        billingClientImpl.zzaA(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ Object zzv(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaC(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Object zzw(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        billingClientImpl.zzaB(billingConfigResponseListener);
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzu(BillingClientImpl.this, acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzR(BillingClientImpl.this, acknowledgePurchaseResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, zzay);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzay);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzba
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzs(BillingClientImpl.this, consumeResponseListener, consumeParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbb
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzL(BillingClientImpl.this, consumeResponseListener, consumeParams);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, zzay);
            consumeResponseListener.onConsumeResponse(zzay, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzau
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzG(BillingClientImpl.this, alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzav
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createBillingProgramReportingDetailsAsync(final BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        try {
            zzaN(new Callable() { // from class: com.android.billingclient.api.zzao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.zzH(BillingClientImpl.this, billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzaU(billingProgramReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzav());
        } catch (Exception e) {
            zzaU(billingProgramReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzE(BillingClientImpl.this, externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaV(externalOfferReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaV(externalOfferReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbx(12);
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    this.zzf.zzh();
                }
            } finally {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                zzbj();
                zzbh();
                zzbg(3);
                this.zzH = null;
            }
            try {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                zzbj();
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
            try {
                zzbh();
                zzbg(3);
            } catch (Throwable th2) {
                try {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                    zzbg(3);
                } catch (Throwable th3) {
                    zzbg(3);
                    this.zzH = null;
                    throw th3;
                }
            }
            this.zzH = null;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzw(BillingClientImpl.this, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzN(BillingClientImpl.this, billingConfigResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, zzay);
            billingConfigResponseListener.onBillingConfigResponse(zzay, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i;
        synchronized (this.zza) {
            i = this.zzb;
        }
        return i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzI(BillingClientImpl.this, alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzay
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isBillingProgramAvailableAsync(final int i, final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzC(BillingClientImpl.this, billingProgramAvailabilityListener, i);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaR(billingProgramAvailabilityListener, i, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaR(billingProgramAvailabilityListener, i, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzB(BillingClientImpl.this, externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaW(externalOfferAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaW(externalOfferAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c;
        if (!zzbk(3000L)) {
            BillingResult billingResult = zzdc.zzj;
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            if (billingResult.getResponseCode() != 0) {
                zzbs(zzjdVar, 5, billingResult);
            } else {
                zzbx(5);
            }
            return billingResult;
        }
        int i = zzdc.zzI;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 107244:
                if (str.equals("lll")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 108237:
                if (str.equals("mmm")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 109230:
                if (str.equals(BillingClient.FeatureType.INCLUDE_SUSPENDED_SUBSCRIPTIONS)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                BillingResult billingResult2 = this.zzk ? zzdc.zzi : zzdc.zzl;
                zzbr(billingResult2, zzjd.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                return billingResult2;
            case 1:
                BillingResult billingResult3 = this.zzl ? zzdc.zzi : zzdc.zzm;
                zzbr(billingResult3, zzjd.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                return billingResult3;
            case 2:
                BillingResult billingResult4 = this.zzo ? zzdc.zzi : zzdc.zzn;
                zzbr(billingResult4, zzjd.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                return billingResult4;
            case 3:
                BillingResult billingResult5 = this.zzq ? zzdc.zzi : zzdc.zzs;
                zzbr(billingResult5, zzjd.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                return billingResult5;
            case 4:
                BillingResult billingResult6 = this.zzs ? zzdc.zzi : zzdc.zzo;
                zzbr(billingResult6, zzjd.CROSS_APP_NOT_SUPPORTED, 6);
                return billingResult6;
            case 5:
                BillingResult billingResult7 = this.zzr ? zzdc.zzi : zzdc.zzq;
                zzbr(billingResult7, zzjd.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                return billingResult7;
            case 6:
                BillingResult billingResult8 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbr(billingResult8, zzjd.MULTI_ITEM_NOT_SUPPORTED, 8);
                return billingResult8;
            case 7:
                BillingResult billingResult9 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbr(billingResult9, zzjd.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                return billingResult9;
            case '\b':
                BillingResult billingResult10 = this.zzu ? zzdc.zzi : zzdc.zzr;
                zzbr(billingResult10, zzjd.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                return billingResult10;
            case '\t':
                BillingResult billingResult11 = this.zzv ? zzdc.zzi : zzdc.zzy;
                zzbr(billingResult11, zzjd.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                return billingResult11;
            case '\n':
                BillingResult billingResult12 = this.zzv ? zzdc.zzi : zzdc.zzz;
                zzbr(billingResult12, zzjd.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                return billingResult12;
            case 11:
                BillingResult billingResult13 = this.zzx ? zzdc.zzi : zzdc.zzB;
                zzbr(billingResult13, zzjd.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                return billingResult13;
            case '\f':
                BillingResult billingResult14 = this.zzy ? zzdc.zzi : zzdc.zzC;
                zzbr(billingResult14, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                return billingResult14;
            case '\r':
                BillingResult billingResult15 = this.zzB ? zzdc.zzi : zzdc.zzt;
                zzbr(billingResult15, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                return billingResult15;
            case 14:
                BillingResult billingResult16 = this.zzA ? zzdc.zzi : zzdc.zzu;
                zzbr(billingResult16, zzjd.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                return billingResult16;
            case 15:
                BillingResult billingResult17 = this.zzB ? zzdc.zzi : zzdc.zzv;
                zzbr(billingResult17, zzjd.AUTO_PAY_NOT_SUPPORTED, 20);
                return billingResult17;
            case 16:
                BillingResult billingResult18 = this.zzC ? zzdc.zzi : zzdc.zzw;
                zzbr(billingResult18, zzjd.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                return billingResult18;
            default:
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unsupported feature: ".concat(String.valueOf(str)));
                BillingResult billingResult19 = zzdc.zzx;
                zzbr(billingResult19, zzjd.UNKNOWN_FEATURE, 1);
                return billingResult19;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzF) {
            return true;
        }
        return zzbm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b3  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        boolean zzd;
        String productId;
        String productType;
        String str;
        boolean z;
        Future zzK;
        long j;
        boolean z2;
        zzjd zzjdVar;
        String string;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        String str2;
        boolean z3;
        Intent intent;
        long nextLong = new Random().nextLong();
        if (this.zzf == null || this.zzf.zzf() == null) {
            zzjd zzjdVar2 = zzjd.MISSING_LISTENER;
            BillingResult billingResult = zzdc.zzD;
            zzbt(zzjdVar2, 2, billingResult, nextLong);
            return billingResult;
        }
        if (billingFlowParams.getDeveloperBillingOptionParams() != null && this.zzf.zzd() == null) {
            zzjd zzjdVar3 = zzjd.MISSING_DEVELOPER_PROVIDED_BILLING_LISTENER;
            BillingResult billingResult2 = zzdc.zzH;
            zzbt(zzjdVar3, 2, billingResult2, nextLong);
            return billingResult2;
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar4 = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult3 = zzdc.zzj;
            zzbt(zzjdVar4, 2, billingResult3, nextLong);
            zzn(billingResult3);
            return billingResult3;
        }
        synchronized (this.zza) {
            zzd = this.zzj != null ? this.zzj.zzd() : false;
        }
        ArrayList zzj = billingFlowParams.zzj();
        List zzk = billingFlowParams.zzk();
        SkuDetails skuDetails = (SkuDetails) com.google.android.gms.internal.play_billing.zzcb.zza(zzj, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzcb.zza(zzk, null);
        if (skuDetails != null) {
            productId = skuDetails.getSku();
            productType = skuDetails.getType();
        } else {
            productId = productDetailsParams2.zza().getProductId();
            productType = productDetailsParams2.zza().getProductType();
        }
        final String str3 = productId;
        final String str4 = productType;
        if (str4.equals("subs") && !this.zzk) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support subscriptions.");
            zzjd zzjdVar5 = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
            BillingResult billingResult4 = zzdc.zzl;
            zzbv(zzjdVar5, 2, billingResult4, nextLong, zzd);
            zzn(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.zzu() && !this.zzn) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzjd zzjdVar6 = zzjd.EXTRA_PARAMS_NOT_SUPPORTED;
            BillingResult billingResult5 = zzdc.zzf;
            zzbv(zzjdVar6, 2, billingResult5, nextLong, zzd);
            zzn(billingResult5);
            return billingResult5;
        }
        if (zzj.size() > 1 && !this.zzt) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support multi-item purchases.");
            zzjd zzjdVar7 = zzjd.MULTI_ITEM_NOT_SUPPORTED;
            BillingResult billingResult6 = zzdc.zzp;
            zzbv(zzjdVar7, 2, billingResult6, nextLong, zzd);
            zzn(billingResult6);
            return billingResult6;
        }
        if (!zzk.isEmpty() && !this.zzu) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzjd zzjdVar8 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
            BillingResult billingResult7 = zzdc.zzr;
            zzbv(zzjdVar8, 2, billingResult7, nextLong, zzd);
            zzn(billingResult7);
            return billingResult7;
        }
        BillingResult zzd2 = billingFlowParams.zzd();
        if (zzd2 != zzdc.zzi) {
            zzbv(zzjd.INVALID_BILLING_FLOW_PARAMS, 2, zzd2, nextLong, zzd);
            zzn(zzd2);
            return zzd2;
        }
        if (this.zzn) {
            z = zzd;
            final Bundle zzf = com.google.android.gms.internal.play_billing.zzc.zzf(billingFlowParams, this.zzp, this.zzw, this.zzE.isEnabledForOneTimeProducts(), this.zzE.isEnabledForPrepaidPlans(), this.zzG, this.zzc, this.zzd, this.zzJ.longValue(), this.zzg.getPackageName(), nextLong);
            if (zzj.isEmpty()) {
                productDetailsParams = productDetailsParams2;
                ArrayList arrayList = new ArrayList(zzk.size() - 1);
                ArrayList arrayList2 = new ArrayList(zzk.size() - 1);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i = 0; i < zzk.size(); i++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) zzk.get(i);
                    ProductDetails zza = productDetailsParams3.zza();
                    if (!zza.zzb().isEmpty()) {
                        arrayList3.add(zza.zzb());
                    }
                    String zzb = productDetailsParams3.zzb();
                    arrayList4.add(zzb);
                    String zzc = zza.zzc(zzb);
                    if (!TextUtils.isEmpty(zzc)) {
                        arrayList5.add(zzc);
                    }
                    if (i > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i)).zza().getProductType());
                    }
                }
                zzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    zzf.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    zzf.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    zzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    zzf.putStringArrayList("additionalSkus", arrayList);
                    zzf.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                Iterator it = zzj.iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                while (it.hasNext()) {
                    SkuDetails skuDetails2 = (SkuDetails) it.next();
                    if (!skuDetails2.zzf().isEmpty()) {
                        arrayList7.add(skuDetails2.zzf());
                    }
                    String zzc2 = skuDetails2.zzc();
                    Iterator it2 = it;
                    String zzb2 = skuDetails2.zzb();
                    int zza2 = skuDetails2.zza();
                    BillingFlowParams.ProductDetailsParams productDetailsParams4 = productDetailsParams2;
                    String zze = skuDetails2.zze();
                    arrayList8.add(zzc2);
                    z4 |= !TextUtils.isEmpty(zzc2);
                    arrayList9.add(zzb2);
                    z5 |= !TextUtils.isEmpty(zzb2);
                    arrayList10.add(Integer.valueOf(zza2));
                    z6 |= zza2 != 0;
                    z7 |= !TextUtils.isEmpty(zze);
                    arrayList11.add(zze);
                    it = it2;
                    productDetailsParams2 = productDetailsParams4;
                }
                productDetailsParams = productDetailsParams2;
                if (!arrayList7.isEmpty()) {
                    zzf.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z4) {
                    zzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z5) {
                    zzf.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (z6) {
                    zzf.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z7) {
                    zzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                if (zzj.size() > 1) {
                    ArrayList arrayList12 = new ArrayList(zzj.size() - 1);
                    ArrayList arrayList13 = new ArrayList(zzj.size() - 1);
                    for (int i2 = 1; i2 < zzj.size(); i2++) {
                        arrayList12.add(((SkuDetails) zzj.get(i2)).getSku());
                        arrayList13.add(((SkuDetails) zzj.get(i2)).getType());
                    }
                    zzf.putStringArrayList("additionalSkus", arrayList12);
                    zzf.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            if (zzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.zzr) {
                zzjd zzjdVar9 = zzjd.OFFER_ID_TOKEN_NOT_SUPPORTED;
                BillingResult billingResult8 = zzdc.zzq;
                zzbv(zzjdVar9, 2, billingResult8, nextLong, z);
                zzn(billingResult8);
                return billingResult8;
            }
            if (skuDetails != null && !TextUtils.isEmpty(skuDetails.zzd())) {
                zzf.putString("skuPackageName", skuDetails.zzd());
            } else if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                str2 = null;
                z3 = false;
                if (!TextUtils.isEmpty(str2)) {
                    zzf.putString("accountName", str2);
                }
                intent = activity.getIntent();
                if (intent != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Activity's intent is null.");
                } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    zzf.putString("proxyPackage", stringExtra);
                    try {
                        zzf.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzf.putString("proxyPackageVersion", "package not found");
                    }
                }
                final int i3 = (this.zzu || zzk.isEmpty()) ? (this.zzs || !z3) ? !this.zzp ? 9 : 6 : 15 : 17;
                str = str2;
                nextLong = nextLong;
                zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzaf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle zzat;
                        zzat = BillingClientImpl.this.zzat(i3, str3, str4, billingFlowParams, zzf);
                        return zzat;
                    }
                }, 5000L, null, this.zze, zzJ());
                j = zzf;
            } else {
                zzf.putString("skuPackageName", productDetailsParams.zza().zza());
            }
            str2 = null;
            z3 = true;
            if (!TextUtils.isEmpty(str2)) {
            }
            intent = activity.getIntent();
            if (intent != null) {
            }
            final int i32 = (this.zzu || zzk.isEmpty()) ? (this.zzs || !z3) ? !this.zzp ? 9 : 6 : 15 : 17;
            str = str2;
            nextLong = nextLong;
            zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzat;
                    zzat = BillingClientImpl.this.zzat(i32, str3, str4, billingFlowParams, zzf);
                    return zzat;
                }
            }, 5000L, null, this.zze, zzJ());
            j = zzf;
        } else {
            str = null;
            z = zzd;
            final String str5 = str3;
            zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzag
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzau;
                    zzau = BillingClientImpl.this.zzau(str5, str4);
                    return zzau;
                }
            }, 5000L, null, this.zze, zzJ());
            j = str5;
        }
        try {
            if (zzK == null) {
                try {
                    zzjd zzjdVar10 = zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    BillingResult billingResult9 = zzdc.zzc;
                    zzbv(zzjdVar10, 2, billingResult9, nextLong, z);
                    zzn(billingResult9);
                    return billingResult9;
                } catch (CancellationException e) {
                    e = e;
                    j = nextLong;
                    z2 = z;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar11 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult10 = zzdc.zzk;
                    zzbw(zzjdVar11, 2, billingResult10, zzcy.zza(e), j, z2);
                    zzn(billingResult10);
                    return billingResult10;
                } catch (TimeoutException e2) {
                    e = e2;
                    j = nextLong;
                    z2 = z;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar112 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult102 = zzdc.zzk;
                    zzbw(zzjdVar112, 2, billingResult102, zzcy.zza(e), j, z2);
                    zzn(billingResult102);
                    return billingResult102;
                } catch (Exception e3) {
                    e = e3;
                    j = nextLong;
                    z2 = z;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar12 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    BillingResult billingResult11 = zzdc.zzj;
                    zzbw(zzjdVar12, 2, billingResult11, zzcy.zza(e), j, z2);
                    zzn(billingResult11);
                    return billingResult11;
                }
            }
            j = nextLong;
            Bundle bundle = (Bundle) zzK.get(5000L, TimeUnit.MILLISECONDS);
            int zzb3 = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
            String zzk2 = com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient");
            if (zzb3 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j);
                z2 = z;
                try {
                    intent2.putExtra("wasServiceAutoReconnected", z2);
                    activity.startActivity(intent2);
                    return zzdc.zzi;
                } catch (CancellationException e4) {
                    e = e4;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar1122 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult1022 = zzdc.zzk;
                    zzbw(zzjdVar1122, 2, billingResult1022, zzcy.zza(e), j, z2);
                    zzn(billingResult1022);
                    return billingResult1022;
                } catch (TimeoutException e5) {
                    e = e5;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar11222 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult10222 = zzdc.zzk;
                    zzbw(zzjdVar11222, 2, billingResult10222, zzcy.zza(e), j, z2);
                    zzn(billingResult10222);
                    return billingResult10222;
                } catch (Exception e6) {
                    e = e6;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar122 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    BillingResult billingResult112 = zzdc.zzj;
                    zzbw(zzjdVar122, 2, billingResult112, zzcy.zza(e), j, z2);
                    zzn(billingResult112);
                    return billingResult112;
                }
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to buy item, Error response code: " + zzb3);
            BillingResult zza3 = zzdc.zza(zzb3, zzk2);
            try {
                if (bundle == null) {
                    zzjdVar = zzjd.REASON_UNSPECIFIED;
                } else {
                    Object obj = bundle.get("LOG_REASON");
                    if (obj == null) {
                        zzjdVar = zzjd.REASON_UNSPECIFIED;
                    } else if (obj instanceof Integer) {
                        zzjdVar = zzjd.zzb(((Integer) obj).intValue());
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        zzjdVar = zzjd.REASON_UNSPECIFIED;
                    }
                }
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                zzjdVar = zzjd.REASON_UNSPECIFIED;
            }
            if (zzjdVar == zzjd.REASON_UNSPECIFIED) {
                zzjdVar = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzjd zzjdVar13 = zzjdVar;
            if (bundle != null) {
                try {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                zzbw(zzjdVar13, 2, zza3, string, j, z);
                zzn(zza3);
                return zza3;
            }
            string = str;
            zzbw(zzjdVar13, 2, zza3, string, j, z);
            zzn(zza3);
            return zza3;
        } catch (CancellationException e7) {
            e = e7;
        } catch (TimeoutException e8) {
            e = e8;
        } catch (Exception e9) {
            e = e9;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void launchExternalLink(final Activity activity, final LaunchExternalLinkParams launchExternalLinkParams, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        try {
            zzaN(new Callable() { // from class: com.android.billingclient.api.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.zzD(BillingClientImpl.this, launchExternalLinkResponseListener, launchExternalLinkParams, activity);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzaZ(launchExternalLinkResponseListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzav());
        } catch (Exception e) {
            zzaZ(launchExternalLinkResponseListener, zzay(), zzjd.SERVICE_CALL_EXCEPTION, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzt(BillingClientImpl.this, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzT(BillingClientImpl.this, productDetailsResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, zzay);
            productDetailsResponseListener.onProductDetailsResponse(zzay, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (zzK(new zzbm(this, purchasesResponseListener, queryPurchasesParams.zza(), queryPurchasesParams.getIncludeSuspendedSubscriptions()), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbj
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzM(BillingClientImpl.this, purchasesResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, zzay);
            purchasesResponseListener.onQueryPurchasesResponse(zzay, com.google.android.gms.internal.play_billing.zzbw.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!zzbk(3000L)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
            return zzdc.zzj;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzdc.zzs;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        String str = this.zzd;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        Handler handler = this.zze;
        final zzbn zzbnVar = new zzbn(this, handler, inAppMessageResponseListener);
        zzK(new Callable() { // from class: com.android.billingclient.api.zzbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzv(BillingClientImpl.this, bundle, activity, zzbnVar);
                return null;
            }
        }, 5000L, null, handler, zzJ());
        return zzdc.zzi;
    }

    final synchronized ExecutorService zzJ() {
        if (this.zzI == null) {
            this.zzI = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new zzbl(this));
        }
        return this.zzI;
    }

    public final void zzao(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    final zzcg zzh(QueryProductDetailsParams queryProductDetailsParams) throws JSONException {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbw zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList<QueryProductDetailsParams.Product> arrayList3 = new ArrayList(zza.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i3)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    return zzaw(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z = this.zzw && this.zzE.isEnabledForPrepaidPlans();
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                Bundle zzj = zzapVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), zzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzg(str, this.zzd, arrayList3, null, null, com.google.android.gms.internal.play_billing.zza.zza(z, true, true, true, false, true), this.zzJ.longValue()));
                if (zzj == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzj.containsKey("DETAILS_LIST")) {
                    int zzb2 = com.google.android.gms.internal.play_billing.zzc.zzb(zzj, "BillingClient");
                    String zzk = com.google.android.gms.internal.play_billing.zzc.zzk(zzj, "BillingClient");
                    if (zzb2 == 0) {
                        return zzaw(zzdc.zza(6, zzk), zzjd.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzaw(zzdc.zza(zzb2, zzk), zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb2, null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i4));
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e) {
                        return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (QueryProductDetailsParams.Product product : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                    break;
                                }
                                ProductDetails productDetails2 = (ProductDetails) it.next();
                                if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                }
                            }
                        }
                    } else {
                        Iterator<String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct(it2.next());
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i = i2;
                } catch (JSONException e2) {
                    return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                }
            } catch (DeadObjectException e3) {
                return zzaw(zzdc.zzj, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (Exception e4) {
                return zzaw(zzdc.zzh, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new zzcg(0, "", arrayList, arrayList2);
    }

    final zzcz zzk() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zzn(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzV(BillingClientImpl.this, billingResult);
            }
        });
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzjd zzjdVar2 = zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzC;
            zzbs(zzjdVar2, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbo zzboVar = new zzbo(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzA(BillingClientImpl.this, alternativeBillingOnlyInformationDialogListener, activity, zzboVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult zzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 16, zzay);
        return zzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support external offer.");
            zzjd zzjdVar2 = zzjd.EXTERNAL_OFFER_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzt;
            zzbs(zzjdVar2, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbp zzbpVar = new zzbp(this, handler, externalOfferInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzF(BillingClientImpl.this, externalOfferInformationDialogListener, activity, zzbpVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaX(externalOfferInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult zzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 25, zzay);
        return zzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        zzbi(billingClientStateListener, 0);
    }

    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, developerProvidedBillingListener, str, null, builder);
    }

    private BillingClientImpl(String str) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
    }

    BillingClientImpl(String str, Context context, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = valueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String zzaE = zzaE();
        this.zzd = zzaE;
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(BuildConfig.VERSION_NAME);
        if (zzaE != null) {
            zza.zzy(zzaE);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbo zzboVar = builder.zzb;
        this.zzF = builder.zza;
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(this.zzJ.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, null, userChoiceBillingListener, developerProvidedBillingListener, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = userChoiceBillingListener != null;
        com.google.android.gms.internal.play_billing.zzbo zzboVar = builder.zzb;
        this.zzF = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdo zzdoVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = valueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String zzaE = zzaE();
        this.zzd = zzaE;
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(BuildConfig.VERSION_NAME);
        if (zzaE != null) {
            zza.zzy(zzaE);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new zzab(this.zzg, null, null, null, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbo zzboVar = builder.zzb;
        this.zzF = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, null, BuildConfig.VERSION_NAME, null, builder);
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, BuildConfig.VERSION_NAME, null, userChoiceBillingListener, developerProvidedBillingListener, null, null, builder);
    }
}

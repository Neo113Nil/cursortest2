package fman.ge.smart_auth;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.media3.common.C0335t;
import androidx.media3.common.C0336u;
import androidx.media3.common.C0337v;
import androidx.media3.exoplayer.offline.h;
import com.google.android.exoplayer2.C0799v0;
import com.google.android.gms.auth.api.identity.C0816j;
import com.google.android.gms.common.api.Status;
import fman.ge.smart_auth.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u000389:B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016J\"\u0010'\u001a\u00020\u00112\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J,\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u00102\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020\u0011H\u0016J\"\u0010-\u001a\u00020\u00112\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u001a\u0010.\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u001a\u0010/\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u0011H\u0002J\u0012\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0016\u00105\u001a\u00020\u00112\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001107H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0018\u00010\u0015R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lfman/ge/smart_auth/SmartAuthPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "Lfman/ge/smart_auth/SmartAuthApi;", "<init>", "()V", "mContext", "Landroid/content/Context;", "mActivity", "Landroid/app/Activity;", "mBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "pendingResult", "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "smsReceiver", "Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;", "consentReceiver", "Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;", "onAttachedToEngine", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onAttachedToActivity", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "getAppSignature", "getSmsWithRetrieverApi", "callback", "getSmsWithUserConsentApi", "phoneNumber", "removeSmsRetrieverListener", "removeUserConsentListener", "requestPhoneNumberHint", "onSmsConsentRequest", "onPhoneNumberHintRequest", "dispose", "unregisterAllReceivers", "unregisterReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "ignoreIllegalState", "fn", "Lkotlin/Function0;", "SmsBroadcastReceiver", "ConsentBroadcastReceiver", "Companion", "smart_auth_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSmartAuthPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartAuthPlugin.kt\nfman/ge/smart_auth/SmartAuthPlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
/* renamed from: fman.ge.smart_auth.e, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class SmartAuthPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, d {
    public Context a;
    public Activity b;
    public ActivityPluginBinding c;
    public Function1<? super Result<String>, Unit> d;
    public c e;
    public b f;

    /* renamed from: fman.ge.smart_auth.e$b */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Activity activity;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
                SmartAuthPlugin smartAuthPlugin = SmartAuthPlugin.this;
                smartAuthPlugin.c();
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    Intrinsics.checkNotNull(extras);
                    if (extras.containsKey("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) {
                        Bundle extras2 = intent.getExtras();
                        Intrinsics.checkNotNull(extras2);
                        Object obj = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
                        int i = ((Status) obj).a;
                        if (i != 0) {
                            if (i == 15) {
                                smartAuthPlugin.getClass();
                                try {
                                    Function1<? super Result<String>, Unit> function1 = smartAuthPlugin.d;
                                    if (function1 != null) {
                                        Result.Companion companion = Result.INSTANCE;
                                        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("ConsentBroadcastReceiver Timeout")))));
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    return;
                                } catch (IllegalStateException e) {
                                    e.toString();
                                    return;
                                }
                            }
                            String str = "ConsentBroadcastReceiver failed with status code: " + i;
                            smartAuthPlugin.getClass();
                            try {
                                Function1<? super Result<String>, Unit> function12 = smartAuthPlugin.d;
                                if (function12 != null) {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    function12.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception(str)))));
                                }
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            } catch (IllegalStateException e2) {
                                e2.toString();
                                return;
                            }
                        }
                        try {
                            Intent intent2 = (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                            if (intent2 != null && (activity = smartAuthPlugin.b) != null) {
                                if (activity != null) {
                                    activity.startActivityForResult(intent2, 11101);
                                    Unit unit3 = Unit.INSTANCE;
                                    return;
                                }
                                return;
                            }
                            smartAuthPlugin.getClass();
                            try {
                                Function1<? super Result<String>, Unit> function13 = smartAuthPlugin.d;
                                if (function13 != null) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    function13.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("ConsentBroadcastReceiver error: Can't start consent intent. consentIntent or mActivity is null")))));
                                }
                                Unit unit4 = Unit.INSTANCE;
                            } catch (IllegalStateException e3) {
                                e3.toString();
                            }
                            Unit unit5 = Unit.INSTANCE;
                            return;
                        } catch (ActivityNotFoundException e4) {
                            String str2 = "ConsentBroadcastReceiver error: " + e4;
                            smartAuthPlugin.getClass();
                            try {
                                Function1<? super Result<String>, Unit> function14 = smartAuthPlugin.d;
                                if (function14 != null) {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    function14.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception(str2)))));
                                }
                                Unit unit6 = Unit.INSTANCE;
                            } catch (IllegalStateException e5) {
                                e5.toString();
                            }
                            Unit unit7 = Unit.INSTANCE;
                            return;
                        }
                    }
                }
                smartAuthPlugin.getClass();
                try {
                    Function1<? super Result<String>, Unit> function15 = smartAuthPlugin.d;
                    if (function15 != null) {
                        Result.Companion companion5 = Result.INSTANCE;
                        function15.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("ConsentBroadcastReceiver failed with no status code")))));
                    }
                    Unit unit8 = Unit.INSTANCE;
                } catch (IllegalStateException e6) {
                    e6.toString();
                }
            }
        }
    }

    /* renamed from: fman.ge.smart_auth.e$c */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
                SmartAuthPlugin smartAuthPlugin = SmartAuthPlugin.this;
                smartAuthPlugin.b();
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    Intrinsics.checkNotNull(extras);
                    if (extras.containsKey("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) {
                        Bundle extras2 = intent.getExtras();
                        Intrinsics.checkNotNull(extras2);
                        Object obj = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
                        int i = ((Status) obj).a;
                        if (i == 0) {
                            String string = extras2.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                            if (string != null) {
                                smartAuthPlugin.getClass();
                                try {
                                    Function1<? super Result<String>, Unit> function1 = smartAuthPlugin.d;
                                    if (function1 != null) {
                                        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(string)));
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    return;
                                } catch (IllegalStateException e) {
                                    e.toString();
                                    return;
                                }
                            }
                            smartAuthPlugin.getClass();
                            try {
                                Function1<? super Result<String>, Unit> function12 = smartAuthPlugin.d;
                                if (function12 != null) {
                                    Result.Companion companion = Result.INSTANCE;
                                    function12.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("Retrieved SMS is null, check if SMS contains correct app signature")))));
                                }
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            } catch (IllegalStateException e2) {
                                e2.toString();
                                return;
                            }
                        }
                        if (i == 15) {
                            smartAuthPlugin.getClass();
                            try {
                                Function1<? super Result<String>, Unit> function13 = smartAuthPlugin.d;
                                if (function13 != null) {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    function13.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("SMS Retriever API timed out, check if SMS contains correct app signature")))));
                                }
                                Unit unit3 = Unit.INSTANCE;
                                return;
                            } catch (IllegalStateException e3) {
                                e3.toString();
                                return;
                            }
                        }
                        String str = "SMS Retriever API failed with status code: " + i + ", check if SMS contains correct app signature";
                        smartAuthPlugin.getClass();
                        try {
                            Function1<? super Result<String>, Unit> function14 = smartAuthPlugin.d;
                            if (function14 != null) {
                                Result.Companion companion3 = Result.INSTANCE;
                                function14.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception(str)))));
                            }
                            Unit unit4 = Unit.INSTANCE;
                            return;
                        } catch (IllegalStateException e4) {
                            e4.toString();
                            return;
                        }
                    }
                }
                smartAuthPlugin.getClass();
                try {
                    Function1<? super Result<String>, Unit> function15 = smartAuthPlugin.d;
                    if (function15 != null) {
                        Result.Companion companion4 = Result.INSTANCE;
                        function15.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("SMS Retriever API failed with no status code, check if SMS contains correct app signature")))));
                    }
                    Unit unit5 = Unit.INSTANCE;
                } catch (IllegalStateException e5) {
                    e5.toString();
                }
            }
        }
    }

    public final String a() {
        SigningInfo signingInfo;
        Context context = this.a;
        Signature[] signatureArr = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = aVar.getPackageName();
            PackageManager packageManager = aVar.getPackageManager();
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                if (signingInfo != null) {
                    signatureArr = signingInfo.getApkContentsSigners();
                }
            } else {
                signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
            }
            if (signatureArr == null) {
                signatureArr = new Signature[0];
            }
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : signatureArr) {
                Intrinsics.checkNotNull(packageName);
                String charsString = signature.toCharsString();
                Intrinsics.checkNotNullExpressionValue(charsString, "toCharsString(...)");
                String a = a.a(packageName, charsString);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            arrayList = new ArrayList();
        }
        String str = (String) CollectionsKt.getOrNull(arrayList, 0);
        return str == null ? "" : str;
    }

    public final void b() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                Context context = this.a;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                }
                context.unregisterReceiver(cVar);
            } catch (Exception unused) {
            }
            this.e = null;
        }
    }

    public final void c() {
        b bVar = this.f;
        if (bVar != null) {
            try {
                Context context = this.a;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                }
                context.unregisterReceiver(bVar);
            } catch (Exception unused) {
            }
            this.f = null;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        Context context = null;
        if (requestCode == 11100) {
            if (resultCode == -1 && data != null) {
                Context context2 = this.a;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context2;
                }
                String phoneNumberFromIntent = C0816j.b(context).getPhoneNumberFromIntent(data);
                Intrinsics.checkNotNullExpressionValue(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                try {
                    Function1<? super Result<String>, Unit> function1 = this.d;
                    if (function1 != null) {
                        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(phoneNumberFromIntent)));
                    }
                    Unit unit = Unit.INSTANCE;
                    return true;
                } catch (IllegalStateException e) {
                    e.toString();
                    return true;
                }
            }
            if (resultCode == 0) {
                try {
                    Function1<? super Result<String>, Unit> function12 = this.d;
                    if (function12 != null) {
                        Result.Companion companion = Result.INSTANCE;
                        function12.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new fman.ge.smart_auth.b("PHONE_NUMBER_HINT_CANCELED", "User canceled phone number hint request.", new f(null))))));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    return true;
                } catch (IllegalStateException e2) {
                    e2.toString();
                    return true;
                }
            }
            String a = android.support.v4.media.a.a(resultCode, "Failed to get phone number hint with resultCode: ");
            try {
                Function1<? super Result<String>, Unit> function13 = this.d;
                if (function13 != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    function13.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new fman.ge.smart_auth.b("PHONE_NUMBER_HINT_FAILED", a, null)))));
                }
                Unit unit3 = Unit.INSTANCE;
                return true;
            } catch (IllegalStateException e3) {
                e3.toString();
                return true;
            }
        }
        if (requestCode != 11101) {
            return true;
        }
        if (resultCode != -1 || data == null) {
            if (resultCode == 0) {
                try {
                    Function1<? super Result<String>, Unit> function14 = this.d;
                    if (function14 != null) {
                        Result.Companion companion3 = Result.INSTANCE;
                        function14.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new fman.ge.smart_auth.b("USER_CONSENT_CANCELED", "User canceled SMS consent request.", new f(null))))));
                    }
                    Unit unit4 = Unit.INSTANCE;
                    return true;
                } catch (IllegalStateException e4) {
                    e4.toString();
                    return true;
                }
            }
            try {
                Function1<? super Result<String>, Unit> function15 = this.d;
                if (function15 != null) {
                    Result.Companion companion4 = Result.INSTANCE;
                    function15.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("Failed to get SMS with user consent.")))));
                }
                Unit unit5 = Unit.INSTANCE;
                return true;
            } catch (IllegalStateException e5) {
                e5.toString();
                return true;
            }
        }
        String stringExtra = data.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        if (stringExtra != null) {
            try {
                Function1<? super Result<String>, Unit> function16 = this.d;
                if (function16 != null) {
                    function16.invoke(Result.m1715boximpl(Result.m1716constructorimpl(stringExtra)));
                }
                Unit unit6 = Unit.INSTANCE;
                return true;
            } catch (IllegalStateException e6) {
                e6.toString();
                return true;
            }
        }
        try {
            Function1<? super Result<String>, Unit> function17 = this.d;
            if (function17 != null) {
                Result.Companion companion5 = Result.INSTANCE;
                function17.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception("Failed to get SMS with user consent.")))));
            }
            Unit unit7 = Unit.INSTANCE;
            return true;
        } catch (IllegalStateException e7) {
            e7.toString();
            return true;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = binding.getActivity();
        this.c = binding;
        binding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        d.a aVar = d.Companion;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.getAppSignature", ""), d.a.a()).setMessageHandler(new C0335t(this, 2));
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.getSmsWithRetrieverApi", ""), d.a.a()).setMessageHandler(new C0336u(this, 2));
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.getSmsWithUserConsentApi", ""), d.a.a()).setMessageHandler(new C0337v(this, 4));
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.removeSmsRetrieverListener", ""), d.a.a()).setMessageHandler(new o(this, 4));
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.removeUserConsentListener", ""), d.a.a()).setMessageHandler(new h(this, 2));
        new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.smart_auth.SmartAuthApi.requestPhoneNumberHint", ""), d.a.a()).setMessageHandler(new C0799v0(this, 2));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        b();
        c();
        this.b = null;
        ActivityPluginBinding activityPluginBinding = this.c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        b();
        c();
        this.b = null;
        ActivityPluginBinding activityPluginBinding = this.c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        b();
        c();
        this.b = null;
        ActivityPluginBinding activityPluginBinding = this.c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = binding.getActivity();
        this.c = binding;
        binding.addActivityResultListener(this);
    }
}

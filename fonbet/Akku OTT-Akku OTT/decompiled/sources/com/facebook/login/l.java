package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0688a;
import com.facebook.C0728q;
import com.facebook.EnumC0718l;
import com.facebook.F;
import com.facebook.FacebookActivity;
import com.facebook.S;
import com.facebook.login.l;
import com.facebook.login.u;
import com.facebook.z;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.haryanvi.netstream.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/facebook/login/l;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "a", "b", "c", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceAuthDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAuthDialog.kt\ncom/facebook/login/DeviceAuthDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,545:1\n1#2:546\n*E\n"})
/* loaded from: classes3.dex */
public class l extends DialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public View a;
    public TextView b;
    public TextView c;
    public m d;
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile com.facebook.C f;
    public volatile ScheduledFuture<?> i;
    public volatile c j;
    public boolean k;
    public boolean l;
    public u.c m;

    /* renamed from: com.facebook.login.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final b a(Companion companion, JSONObject jSONObject) {
            String optString;
            companion.getClass();
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList grantedPermissions = new ArrayList();
            ArrayList declinedPermissions = new ArrayList();
            ArrayList expiredPermissions = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String permission = optJSONObject.optString("permission");
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (permission.length() != 0 && !Intrinsics.areEqual(permission, "installed") && (optString = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                declinedPermissions.add(permission);
                            }
                        } else if (optString.equals("granted")) {
                            grantedPermissions.add(permission);
                        }
                    } else if (optString.equals("expired")) {
                        expiredPermissions.add(permission);
                    }
                }
            }
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            b bVar = new b();
            bVar.a = grantedPermissions;
            bVar.b = declinedPermissions;
            bVar.c = expiredPermissions;
            return bVar;
        }
    }

    public static final class b {
        public ArrayList a;
        public ArrayList b;
        public ArrayList c;
    }

    public static final class c implements Parcelable {
        public String a;
        public String b;
        public String c;
        public long d;
        public long e;
        public static final b Companion = new b();

        @JvmField
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                c cVar = new c();
                cVar.a = parcel.readString();
                cVar.b = parcel.readString();
                cVar.c = parcel.readString();
                cVar.d = parcel.readLong();
                cVar.e = parcel.readLong();
                return cVar;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public static final class b {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.a);
            dest.writeString(this.b);
            dest.writeString(this.c);
            dest.writeLong(this.d);
            dest.writeLong(this.e);
        }
    }

    public static final class d extends Dialog {
        public d(FragmentActivity fragmentActivity) {
            super(fragmentActivity, R.style.com_facebook_auth_dialog);
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            l.this.getClass();
            super.onBackPressed();
        }
    }

    public final void e(String userId, b bVar, String accessToken, Date date, Date date2) {
        m mVar = this.d;
        if (mVar != null) {
            String applicationId = com.facebook.w.b();
            ArrayList arrayList = bVar.a;
            ArrayList arrayList2 = bVar.b;
            ArrayList arrayList3 = bVar.c;
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            C0688a token = new C0688a(accessToken, applicationId, userId, arrayList, arrayList2, arrayList3, EnumC0718l.DEVICE_AUTH, date, null, date2);
            u.d.c cVar = u.d.Companion;
            u.c cVar2 = mVar.n().i;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(token, "token");
            mVar.n().n(new u.d(cVar2, u.d.a.SUCCESS, token, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View f(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View inflate = layoutInflater.inflate(z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.a = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.b = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cancel_button);
        Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l this$0 = l.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.g();
            }
        });
        View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        this.c = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public final void g() {
        if (this.e.compareAndSet(false, true)) {
            c cVar = this.j;
            if (cVar != null) {
                com.facebook.devicerequests.internal.a.a(cVar.b);
            }
            m mVar = this.d;
            if (mVar != null) {
                u.d.c cVar2 = u.d.Companion;
                u.c cVar3 = mVar.n().i;
                cVar2.getClass();
                mVar.n().n(u.d.c.a(cVar3, "User canceled log in."));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void h(C0728q ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.e.compareAndSet(false, true)) {
            c cVar = this.j;
            if (cVar != null) {
                com.facebook.devicerequests.internal.a.a(cVar.b);
            }
            m mVar = this.d;
            if (mVar != null) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                mVar.n().n(u.d.c.c(u.d.Companion, mVar.n().i, null, ex.getMessage()));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void i(final String str, long j, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = j != 0 ? new Date((j * 1000) + new Date().getTime()) : null;
        final Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        C0688a c0688a = new C0688a(str, com.facebook.w.b(), SessionDescription.SUPPORTED_SDP_VERSION, null, null, null, null, date, null, date2);
        final Date date3 = date;
        z.c cVar = com.facebook.z.Companion;
        z.b bVar = new z.b() { // from class: com.facebook.login.i
            @Override // com.facebook.z.b
            public final void a(com.facebook.E response) {
                EnumSet<com.facebook.internal.B> enumSet;
                final l this$0 = l.this;
                final String accessToken = str;
                final Date date4 = date3;
                final Date date5 = date2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                if (this$0.e.get()) {
                    return;
                }
                com.facebook.t tVar = response.c;
                if (tVar != null) {
                    C0728q c0728q = tVar.k;
                    if (c0728q == null) {
                        c0728q = new C0728q();
                    }
                    this$0.h(c0728q);
                    return;
                }
                try {
                    JSONObject jSONObject = response.b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
                    final l.b a = l.Companion.a(l.INSTANCE, jSONObject);
                    String string2 = jSONObject.getString("name");
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
                    l.c cVar2 = this$0.j;
                    if (cVar2 != null) {
                        com.facebook.devicerequests.internal.a.a(cVar2.b);
                    }
                    com.facebook.internal.n b2 = com.facebook.internal.p.b(com.facebook.w.b());
                    if (!Intrinsics.areEqual((b2 == null || (enumSet = b2.c) == null) ? null : Boolean.valueOf(enumSet.contains(com.facebook.internal.B.RequireConfirm)), Boolean.TRUE) || this$0.l) {
                        this$0.e(string, a, accessToken, date4, date5);
                        return;
                    }
                    this$0.l = true;
                    String string3 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                    Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…login_confirmation_title)");
                    String string4 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.st…confirmation_continue_as)");
                    String string5 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.st…ogin_confirmation_cancel)");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String a2 = androidx.credentials.provider.p.a(new Object[]{string2}, 1, string4, "format(format, *args)");
                    AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(a2, new DialogInterface.OnClickListener() { // from class: com.facebook.login.j
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            l this$02 = l.this;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            String userId = string;
                            Intrinsics.checkNotNullParameter(userId, "$userId");
                            l.b permissions = a;
                            Intrinsics.checkNotNullParameter(permissions, "$permissions");
                            String accessToken2 = accessToken;
                            Intrinsics.checkNotNullParameter(accessToken2, "$accessToken");
                            this$02.e(userId, permissions, accessToken2, date4, date5);
                        }
                    }).setPositiveButton(string5, new DialogInterface.OnClickListener() { // from class: com.facebook.login.k
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            l this$02 = l.this;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            View f = this$02.f(false);
                            Dialog dialog = this$02.getDialog();
                            if (dialog != null) {
                                dialog.setContentView(f);
                            }
                            u.c cVar3 = this$02.m;
                            if (cVar3 != null) {
                                this$02.m(cVar3);
                            }
                        }
                    });
                    builder.create().show();
                } catch (JSONException e) {
                    this$0.h(new C0728q(e));
                }
            }
        };
        cVar.getClass();
        com.facebook.z g = z.c.g(c0688a, "me", bVar);
        g.h = F.a;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        g.d = bundle;
        g.d();
    }

    public final void j() {
        c cVar = this.j;
        if (cVar != null) {
            cVar.e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        c cVar2 = this.j;
        bundle.putString("code", cVar2 != null ? cVar2.c : null);
        StringBuilder sb = new StringBuilder();
        int i = com.facebook.internal.F.a;
        sb.append(com.facebook.w.b());
        sb.append('|');
        com.facebook.internal.F.f();
        String str = com.facebook.w.g;
        if (str == null) {
            throw new C0728q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str);
        bundle.putString("access_token", sb.toString());
        z.c cVar3 = com.facebook.z.Companion;
        z.b bVar = new z.b() { // from class: com.facebook.login.g
            @Override // com.facebook.z.b
            public final void a(com.facebook.E response) {
                l this$0 = l.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (this$0.e.get()) {
                    return;
                }
                com.facebook.t tVar = response.c;
                if (tVar == null) {
                    try {
                        JSONObject jSONObject = response.b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                        this$0.i(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e) {
                        this$0.h(new C0728q(e));
                        return;
                    }
                }
                int i2 = tVar.c;
                if (i2 == 1349174 || i2 == 1349172) {
                    this$0.k();
                    return;
                }
                if (i2 != 1349152) {
                    if (i2 == 1349173) {
                        this$0.g();
                        return;
                    }
                    C0728q c0728q = tVar.k;
                    if (c0728q == null) {
                        c0728q = new C0728q();
                    }
                    this$0.h(c0728q);
                    return;
                }
                l.c cVar4 = this$0.j;
                if (cVar4 != null) {
                    com.facebook.devicerequests.internal.a.a(cVar4.b);
                }
                u.c cVar5 = this$0.m;
                if (cVar5 != null) {
                    this$0.m(cVar5);
                } else {
                    this$0.g();
                }
            }
        };
        cVar3.getClass();
        this.f = new com.facebook.z(null, "device/login_status", bundle, F.b, bVar, 32).d();
    }

    public final void k() {
        c cVar = this.j;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = null;
        Long valueOf = cVar != null ? Long.valueOf(cVar.d) : null;
        if (valueOf != null) {
            synchronized (m.Companion) {
                try {
                    if (m.d == null) {
                        m.d = new ScheduledThreadPoolExecutor(1);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = m.d;
                    if (scheduledThreadPoolExecutor2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    } else {
                        scheduledThreadPoolExecutor = scheduledThreadPoolExecutor2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.facebook.login.f
                @Override // java.lang.Runnable
                public final void run() {
                    l this$0 = l.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.j();
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(c cVar) {
        Bitmap createBitmap;
        TextView textView;
        TextView textView2;
        View view;
        boolean d2;
        this.j = cVar;
        TextView textView3 = this.b;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            textView3 = null;
        }
        textView3.setText(cVar.b);
        String str = cVar.a;
        com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.a;
        boolean z = false;
        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.devicerequests.internal.a.class)) {
            try {
                EnumMap enumMap = new EnumMap(com.google.zxing.b.class);
                enumMap.put((EnumMap) com.google.zxing.b.c, (com.google.zxing.b) 2);
                try {
                    com.google.zxing.common.b a = new com.google.zxing.qrcode.a().a(str, com.google.zxing.a.a, enumMap);
                    int i = a.b;
                    int i2 = a.a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = a.a(i5, i3) ? ViewCompat.MEASURED_STATE_MASK : -1;
                        }
                    }
                    createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (com.google.zxing.c unused) {
                    }
                } catch (com.google.zxing.c unused2) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.devicerequests.internal.a.class);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
            textView = this.c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructions");
                textView = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
            textView2 = this.b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
                textView2 = null;
            }
            textView2.setVisibility(0);
            view = this.a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                view = null;
            }
            view.setVisibility(8);
            if (!this.l) {
                String str2 = cVar.b;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.devicerequests.internal.a.class)) {
                    try {
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.devicerequests.internal.a.class);
                    }
                    if (com.facebook.devicerequests.internal.a.c()) {
                        d2 = com.facebook.devicerequests.internal.a.a.d(str2);
                        if (d2) {
                            com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(getContext(), (String) null);
                            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                            com.facebook.w wVar = com.facebook.w.a;
                            if (S.c()) {
                                loggerImpl.h(null, "fb_smart_login_service");
                            }
                        }
                    }
                }
                d2 = false;
                if (d2) {
                }
            }
            if (cVar.e != 0 && (new Date().getTime() - cVar.e) - (cVar.d * 1000) < 0) {
                z = true;
            }
            if (z) {
                j();
                return;
            } else {
                k();
                return;
            }
        }
        createBitmap = null;
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), createBitmap);
        textView = this.c;
        if (textView == null) {
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable2, (Drawable) null, (Drawable) null);
        textView2 = this.b;
        if (textView2 == null) {
        }
        textView2.setVisibility(0);
        view = this.a;
        if (view == null) {
        }
        view.setVisibility(8);
        if (!this.l) {
        }
        if (cVar.e != 0) {
            z = true;
        }
        if (z) {
        }
    }

    public final void m(u.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.m = request;
        Bundle b2 = new Bundle();
        b2.putString("scope", TextUtils.join(",", request.b));
        String str = request.k;
        com.facebook.internal.E e = com.facebook.internal.E.a;
        Intrinsics.checkNotNullParameter(b2, "b");
        if (!com.facebook.internal.E.z(str)) {
            b2.putString("redirect_uri", str);
        }
        String str2 = request.m;
        Intrinsics.checkNotNullParameter(b2, "b");
        if (!com.facebook.internal.E.z(str2)) {
            b2.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        int i = com.facebook.internal.F.a;
        sb.append(com.facebook.w.b());
        sb.append('|');
        com.facebook.internal.F.f();
        String str3 = com.facebook.w.g;
        if (str3 == null) {
            throw new C0728q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str3);
        b2.putString("access_token", sb.toString());
        com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.a;
        String str4 = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.devicerequests.internal.a.class)) {
            try {
                HashMap hashMap = new HashMap();
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                hashMap.put("device", DEVICE);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                hashMap.put("model", MODEL);
                String jSONObject = new JSONObject(hashMap).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
                str4 = jSONObject;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.devicerequests.internal.a.class);
            }
        }
        b2.putString("device_info", str4);
        z.c cVar = com.facebook.z.Companion;
        z.b bVar = new z.b() { // from class: com.facebook.login.h
            @Override // com.facebook.z.b
            public final void a(com.facebook.E response) {
                l this$0 = l.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (this$0.k) {
                    return;
                }
                com.facebook.t tVar = response.c;
                if (tVar != null) {
                    C0728q c0728q = tVar.k;
                    if (c0728q == null) {
                        c0728q = new C0728q();
                    }
                    this$0.h(c0728q);
                    return;
                }
                JSONObject jSONObject2 = response.b;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                l.c cVar2 = new l.c();
                try {
                    String string = jSONObject2.getString("user_code");
                    cVar2.b = string;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                    cVar2.a = format;
                    cVar2.c = jSONObject2.getString("code");
                    cVar2.d = jSONObject2.getLong("interval");
                    this$0.l(cVar2);
                } catch (JSONException e2) {
                    this$0.h(new C0728q(e2));
                }
            }
        };
        cVar.getClass();
        new com.facebook.z(null, "device/login", b2, F.b, bVar, 32).d();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        d dVar = new d(requireActivity());
        dVar.setContentView(f(com.facebook.devicerequests.internal.a.c() && !this.l));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        u e;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        v vVar = (v) ((FacebookActivity) requireActivity).a;
        this.d = (m) ((vVar == null || (e = vVar.e()) == null) ? null : e.p());
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            l(cVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.k = true;
        this.e.set(true);
        super.onDestroyView();
        com.facebook.C c2 = this.f;
        if (c2 != null) {
            c2.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.k) {
            return;
        }
        g();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.j != null) {
            outState.putParcelable("request_state", this.j);
        }
    }
}

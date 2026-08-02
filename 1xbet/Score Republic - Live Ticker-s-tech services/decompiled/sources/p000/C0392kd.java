package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392kd {

    /* JADX INFO: renamed from: a */
    public int f4346a;

    /* JADX INFO: renamed from: b */
    public int f4347b;

    /* JADX INFO: renamed from: c */
    public final Object f4348c;

    public C0392kd(Context context, XmlResourceParser xmlResourceParser) {
        this.f4348c = new ArrayList();
        this.f4347b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), iz0.f3757h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4346a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4346a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4347b);
                this.f4347b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0103cm().m972a(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m3006a() {
        PackageInfo packageInfoM1502e;
        if (this.f4346a == 0) {
            try {
                packageInfoM1502e = tk1.m4792a((Context) this.f4348c).m1502e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoM1502e = null;
            }
            if (packageInfoM1502e != null) {
                this.f4346a = packageInfoM1502e.versionCode;
            }
        }
        return this.f4346a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m3007b() {
        int i = this.f4347b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f4348c;
        PackageManager packageManager = context.getPackageManager();
        if (tk1.m4792a(context).f2181k.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f4347b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f4347b = 2;
        return 2;
    }

    public C0392kd(Context context) {
        this.f4347b = 0;
        this.f4348c = context;
    }

    public C0392kd(byte[] bArr, int i, int i2) {
        this.f4348c = bArr;
        this.f4346a = i;
        this.f4347b = i2;
    }

    public C0392kd() {
        this.f4348c = new C0392kd[256];
        this.f4346a = 0;
        this.f4347b = 0;
    }

    public C0392kd(int i, int i2) {
        this.f4348c = null;
        this.f4346a = i;
        int i3 = i2 & 7;
        this.f4347b = i3 == 0 ? 8 : i3;
    }
}

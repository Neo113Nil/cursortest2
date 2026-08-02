package p0;

import R1.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import d6.C0977k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15666f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static b f15667g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15668a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15669b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15670c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15671d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final c f15672e;

    public b(Context context) {
        this.f15668a = context;
        this.f15672e = new c(this, context.getMainLooper(), 3);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f15666f) {
            try {
                if (f15667g == null) {
                    f15667g = new b(context.getApplicationContext());
                }
                bVar = f15667g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Intent intent) {
        ArrayList arrayList;
        int i7;
        String str;
        boolean z4;
        synchronized (this.f15669b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15668a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z7 = true;
                boolean z8 = false;
                Object[] objArr = (intent.getFlags() & 8) != 0;
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f15670c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i8 = 0;
                    while (i8 < arrayList2.size()) {
                        C1532a c1532a = (C1532a) arrayList2.get(i8);
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c1532a.f15662a);
                        }
                        if (c1532a.f15664c) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z4 = z7;
                        } else {
                            String str2 = action;
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z4 = z7;
                            int match = c1532a.f15662a.match(str2, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (objArr != false) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c1532a);
                                c1532a.f15664c = z4;
                            } else if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        i8 = i7 + 1;
                        z7 = z4;
                        arrayList2 = arrayList;
                        action = str;
                        z8 = false;
                    }
                    boolean z9 = z7;
                    if (arrayList3 != null) {
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            ((C1532a) arrayList3.get(i9)).f15664c = false;
                        }
                        this.f15671d.add(new C0977k(12, intent, arrayList3));
                        if (!this.f15672e.hasMessages(z9 ? 1 : 0)) {
                            this.f15672e.sendEmptyMessage(z9 ? 1 : 0);
                        }
                        return z9;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

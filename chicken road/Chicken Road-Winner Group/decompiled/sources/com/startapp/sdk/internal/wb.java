package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class wb {
    public static final Object f;

    /* renamed from: g, reason: collision with root package name */
    public static wb f4601g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4603b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4604c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4605d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final tb f4606e;

    static {
        int i3 = p0.f4197a;
        "startapp.".concat("wb");
        f = new Object();
    }

    public wb(Context context) {
        this.f4602a = context;
        this.f4606e = new tb(this, context.getMainLooper());
    }

    public static wb a(Context context) {
        wb wbVar;
        synchronized (f) {
            try {
                if (f4601g == null) {
                    Context a3 = w0.a(context);
                    if (a3 != null) {
                        context = a3;
                    }
                    f4601g = new wb(context);
                }
                wbVar = f4601g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f4603b) {
            try {
                vb vbVar = new vb(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f4603b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f4603b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                    String action = intentFilter.getAction(i3);
                    ArrayList arrayList2 = (ArrayList) this.f4604c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f4604c.put(action, arrayList2);
                    }
                    arrayList2.add(vbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f4603b) {
            try {
                ArrayList arrayList = (ArrayList) this.f4603b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i3);
                    for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                        String action = intentFilter.getAction(i4);
                        ArrayList arrayList2 = (ArrayList) this.f4604c.get(action);
                        if (arrayList2 != null) {
                            int i5 = 0;
                            while (i5 < arrayList2.size()) {
                                if (((vb) arrayList2.get(i5)).f4517b == broadcastReceiver) {
                                    arrayList2.remove(i5);
                                    i5--;
                                }
                                i5++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f4604c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.f4603b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4602a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList arrayList = (ArrayList) this.f4604c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        vb vbVar = (vb) arrayList.get(i3);
                        if (!vbVar.f4518c && vbVar.f4516a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vbVar);
                            vbVar.f4518c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            ((vb) arrayList2.get(i4)).f4518c = false;
                        }
                        this.f4605d.add(new ub(intent, arrayList2));
                        if (!this.f4606e.hasMessages(1)) {
                            this.f4606e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

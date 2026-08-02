package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.C0728q;
import com.facebook.C0729s;
import com.facebook.login.EnumC0722d;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNativeProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeProtocol.kt\ncom/facebook/internal/NativeProtocol\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1010:1\n1603#2,9:1011\n1855#2:1020\n1856#2:1022\n1612#2:1023\n1603#2,9:1024\n1855#2:1033\n1856#2:1035\n1612#2:1036\n1#3:1021\n1#3:1034\n*S KotlinDebug\n*F\n+ 1 NativeProtocol.kt\ncom/facebook/internal/NativeProtocol\n*L\n440#1:1011,9\n440#1:1020\n440#1:1022\n440#1:1023\n493#1:1024,9\n493#1:1033\n493#1:1035\n493#1:1036\n440#1:1021\n493#1:1034\n*E\n"})
/* loaded from: classes3.dex */
public final class w {
    public static final w a;
    public static final ArrayList b;
    public static final AtomicBoolean c;
    public static final Integer[] d;

    public static final class a extends e {
        @Override // com.facebook.internal.w.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // com.facebook.internal.w.e
        public final String c() {
            return "com.facebook.arstudio.player";
        }
    }

    public static final class b extends e {
        @Override // com.facebook.internal.w.e
        public final String b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.w.e
        public final String c() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.w.e
        public final String d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    public static final class c extends e {
        @Override // com.facebook.internal.w.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.w.e
        public final String c() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.w.e
        public final void e() {
            if (com.facebook.w.a().getApplicationInfo().targetSdkVersion < 30 || com.facebook.internal.instrument.crashshield.a.b(w.class)) {
                return;
            }
            try {
                w wVar = w.a;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            }
        }
    }

    public static final class d extends e {
        @Override // com.facebook.internal.w.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // com.facebook.internal.w.e
        public final String c() {
            return "com.facebook.orca";
        }
    }

    public static abstract class e {
        public TreeSet<Integer> a;

        public final synchronized void a(boolean z) {
            TreeSet<Integer> treeSet;
            if (!z) {
                try {
                    TreeSet<Integer> treeSet2 = this.a;
                    if (treeSet2 != null && !treeSet2.isEmpty()) {
                        treeSet = this.a;
                        if (treeSet != null || treeSet.isEmpty()) {
                            e();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w wVar = w.a;
            TreeSet<Integer> treeSet3 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
                try {
                    treeSet3 = wVar.g(this);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, w.class);
                }
            }
            this.a = treeSet3;
            treeSet = this.a;
            if (treeSet != null) {
            }
            e();
        }

        public abstract String b();

        public abstract String c();

        public String d() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void e() {
        }
    }

    public static final class f {
        public static final a Companion = new a();
        public int a;

        public static final class a {
        }
    }

    public static final class g extends e {
        @Override // com.facebook.internal.w.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.w.e
        public final String c() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        w wVar = new w();
        a = wVar;
        b = wVar.a();
        ArrayList arrayList = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(wVar)) {
            try {
                ArrayList arrayListOf = CollectionsKt.arrayListOf(new a());
                arrayListOf.addAll(wVar.a());
                arrayList = arrayListOf;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, wVar);
            }
        }
        w wVar2 = a;
        wVar2.getClass();
        if (!com.facebook.internal.instrument.crashshield.a.b(wVar2)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new d());
                ArrayList arrayList3 = b;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, wVar2);
            }
        }
        c = new AtomicBoolean(false);
        d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(TreeSet<Integer> treeSet, int i, int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet != null) {
                int length = versionSpec.length - 1;
                Iterator<Integer> descendingIterator = treeSet.descendingIterator();
                int i2 = -1;
                while (true) {
                    if (!descendingIterator.hasNext()) {
                        break;
                    }
                    Integer fbAppVersion = descendingIterator.next();
                    Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                    i2 = Math.max(i2, fbAppVersion.intValue());
                    while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (versionSpec[length] == fbAppVersion.intValue()) {
                        break;
                    }
                }
            }
            return -1;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            return 0;
        }
    }

    public static /* synthetic */ Intent d(w wVar, e eVar, String str, HashSet hashSet, String str2, boolean z, EnumC0722d enumC0722d, String str3, String str4, boolean z2, String str5, boolean z3, com.facebook.login.A a2, boolean z4, boolean z5, String str6, String str7, String str8, boolean z6, String str9, int i) {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return null;
        }
        try {
            return wVar.c(eVar, str, hashSet, str2, z, enumC0722d, str3, str4, z2, str5, z3, a2, z4, z5, str6, str7, str8, (i & 524288) != 0 ? false : z6, (i & 2097152) != 0 ? null : str9);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent e(Context context) {
        ResolveInfo resolveService;
        if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((e) it.next()).c()).addCategory("android.intent.category.DEFAULT");
                    if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(context, "context");
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
                        }
                        if (addCategory != null && (resolveService = context.getPackageManager().resolveService(addCategory, 0)) != null) {
                            String str = resolveService.serviceInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
                            if (C0713i.a(context, str)) {
                                if (addCategory == null) {
                                    return addCategory;
                                }
                            }
                        }
                    }
                    addCategory = null;
                    if (addCategory == null) {
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, w.class);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[Catch: all -> 0x0099, TryCatch #3 {all -> 0x0099, blocks: (B:6:0x000a, B:12:0x0050, B:14:0x006c, B:17:0x0095, B:24:0x0091, B:25:0x009b, B:27:0x00a0, B:47:0x0049, B:19:0x0076, B:21:0x0088, B:32:0x001e, B:34:0x0028, B:36:0x002e, B:39:0x003f, B:41:0x0044, B:44:0x0037), top: B:5:0x000a, inners: #0, #2 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent f(Intent requestIntent, Bundle bundle, C0728q c0728q) {
        String stringExtra;
        UUID fromString;
        Bundle bundle2;
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            if (!com.facebook.internal.instrument.crashshield.a.b(w.class) && requestIntent != null) {
                try {
                    if (k(j(requestIntent))) {
                        Bundle bundleExtra = requestIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                        stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                    } else {
                        stringExtra = requestIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, w.class);
                }
                if (stringExtra != null) {
                    try {
                        fromString = UUID.fromString(stringExtra);
                    } catch (IllegalArgumentException unused) {
                        E e2 = E.a;
                        com.facebook.w wVar = com.facebook.w.a;
                    }
                    if (fromString != null) {
                        return null;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", j(requestIntent));
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("action_id", fromString.toString());
                    if (c0728q != null) {
                        if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
                            try {
                                bundle2 = new Bundle();
                                bundle2.putString("error_description", c0728q.toString());
                                if (c0728q instanceof C0729s) {
                                    bundle2.putString("error_type", "UserCanceled");
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, w.class);
                            }
                            bundle3.putBundle(Constants.IPC_BUNDLE_KEY_SEND_ERROR, bundle2);
                        }
                        bundle2 = null;
                        bundle3.putBundle(Constants.IPC_BUNDLE_KEY_SEND_ERROR, bundle2);
                    }
                    intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
                    if (bundle != null) {
                        intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                    }
                    return intent;
                }
            }
            fromString = null;
            if (fromString != null) {
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, w.class);
            return null;
        }
    }

    @JvmStatic
    public static final Bundle i(Intent intent) {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !k(j(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            return null;
        }
    }

    @JvmStatic
    public static final int j(Intent intent) {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            return 0;
        }
    }

    @JvmStatic
    public static final boolean k(int i) {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            return false;
        }
    }

    @JvmStatic
    public static final void l() {
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return;
        }
        try {
            if (c.compareAndSet(false, true)) {
                com.facebook.w.c().execute(new v());
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
        }
    }

    public final ArrayList a() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new c(), new g());
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r25.length() != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        if (com.facebook.internal.instrument.crashshield.a.b(r8) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        r10.putExtra("intent_uri_package_target", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        r9 = "intent://".concat(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        com.facebook.internal.instrument.crashshield.a.a(r0, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:8:0x0017, B:10:0x003d, B:15:0x0049, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:21:0x0086, B:22:0x008d, B:24:0x009f, B:25:0x00a4, B:27:0x00b4, B:29:0x00bf, B:31:0x00c7, B:33:0x00ce, B:36:0x00d5, B:38:0x00fe, B:41:0x0105, B:45:0x00dd, B:48:0x00e4, B:51:0x00f7, B:57:0x00f3, B:53:0x00ec), top: B:5:0x0010, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent c(e eVar, String str, Collection collection, String str2, boolean z, EnumC0722d enumC0722d, String str3, String str4, boolean z2, String str5, boolean z3, com.facebook.login.A a2, boolean z4, boolean z5, String str6, String str7, String str8, boolean z6, String str9) {
        boolean z7;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                String b2 = eVar.b();
                if (b2 != null) {
                    Intent putExtra = new Intent().setClassName(eVar.c(), b2).putExtra("client_id", str);
                    Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
                    com.facebook.w wVar = com.facebook.w.a;
                    putExtra.putExtra("facebook_sdk_version", "18.3.0");
                    E e2 = E.a;
                    if (collection != null && !collection.isEmpty()) {
                        z7 = false;
                        if (!z7) {
                            putExtra.putExtra("scope", TextUtils.join(",", collection));
                        }
                        if (!E.z(str2)) {
                            putExtra.putExtra("e2e", str2);
                        }
                        putExtra.putExtra("state", str3);
                        putExtra.putExtra("response_type", eVar.d());
                        putExtra.putExtra("nonce", str6);
                        putExtra.putExtra("return_scopes", CredentialEntry.TRUE_STRING);
                        if (z) {
                            putExtra.putExtra("default_audience", enumC0722d.a);
                        }
                        putExtra.putExtra("legacy_override", com.facebook.w.d());
                        putExtra.putExtra("auth_type", str4);
                        if (z2) {
                            putExtra.putExtra("fail_on_logged_out", true);
                        }
                        putExtra.putExtra("messenger_page_id", str5);
                        putExtra.putExtra("reset_messenger_state", z3);
                        if (z4) {
                            putExtra.putExtra("fx_app", a2.a);
                        }
                        if (z5) {
                            putExtra.putExtra("skip_dedupe", true);
                        }
                        if (z6) {
                            putExtra.putExtra("force_confirmation", true);
                        }
                        if (str7 != null && str7.length() != 0) {
                            putExtra.putExtra("https_redirect_uri", str7);
                            if (str9 != null && str9.length() != 0) {
                                putExtra.putExtra("android_sso_context", str9);
                            }
                            return putExtra;
                        }
                        if (str9 != null) {
                            putExtra.putExtra("android_sso_context", str9);
                        }
                        return putExtra;
                    }
                    z7 = true;
                    if (!z7) {
                    }
                    if (!E.z(str2)) {
                    }
                    putExtra.putExtra("state", str3);
                    putExtra.putExtra("response_type", eVar.d());
                    putExtra.putExtra("nonce", str6);
                    putExtra.putExtra("return_scopes", CredentialEntry.TRUE_STRING);
                    if (z) {
                    }
                    putExtra.putExtra("legacy_override", com.facebook.w.d());
                    putExtra.putExtra("auth_type", str4);
                    if (z2) {
                    }
                    putExtra.putExtra("messenger_page_id", str5);
                    putExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    if (z6) {
                    }
                    if (str7 != null) {
                        putExtra.putExtra("https_redirect_uri", str7);
                        if (str9 != null) {
                        }
                        return putExtra;
                    }
                    if (str9 != null) {
                    }
                    return putExtra;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(11:41|42|43|9|10|11|12|13|(4:15|16|17|(2:(3:25|22|23)|26))(1:36)|(1:20)|21)|9|10|11|12|13|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #2 {all -> 0x0097, blocks: (B:6:0x000d, B:31:0x009d, B:32:0x00a0, B:20:0x0093, B:46:0x0049, B:42:0x0028), top: B:5:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet<Integer> g(e eVar) {
        Uri uri;
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = com.facebook.w.a().getContentResolver();
            String[] strArr = {"version"};
            try {
                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                    try {
                        Uri parse = Uri.parse("content://" + eVar.c() + ".provider.PlatformProvider/versions");
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
                        uri = parse;
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, this);
                    }
                    providerInfo = com.facebook.w.a().getPackageManager().resolveContentProvider(eVar.c().concat(".provider.PlatformProvider"), 0);
                    if (providerInfo == null) {
                        try {
                            cursor2 = contentResolver.query(uri, strArr, null, null, null);
                        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                            cursor2 = null;
                        }
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                try {
                                    treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                                } catch (Throwable th3) {
                                    cursor = cursor2;
                                    th = th3;
                                    if (cursor == null) {
                                        throw th;
                                    }
                                    cursor.close();
                                    throw th;
                                }
                            }
                        }
                    } else {
                        cursor2 = null;
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return treeSet;
                }
                providerInfo = com.facebook.w.a().getPackageManager().resolveContentProvider(eVar.c().concat(".provider.PlatformProvider"), 0);
                if (providerInfo == null) {
                }
                if (cursor2 != null) {
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
            uri = null;
        } catch (Throwable th5) {
            com.facebook.internal.instrument.crashshield.a.a(th5, this);
            return null;
        }
    }

    public final f h(List<? extends e> list, int[] iArr) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            l();
            if (list == null) {
                f.Companion.getClass();
                f fVar = new f();
                fVar.a = -1;
                return fVar;
            }
            for (e eVar : list) {
                TreeSet<Integer> treeSet = eVar.a;
                int i = 0;
                if (treeSet == null || treeSet.isEmpty()) {
                    eVar.a(false);
                }
                TreeSet<Integer> treeSet2 = eVar.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
                    try {
                        i = d[0].intValue();
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, w.class);
                    }
                }
                int b2 = b(treeSet2, i, iArr);
                if (b2 != -1) {
                    f.Companion.getClass();
                    f fVar2 = new f();
                    fVar2.a = b2;
                    return fVar2;
                }
            }
            f.Companion.getClass();
            f fVar3 = new f();
            fVar3.a = -1;
            return fVar3;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }
}

package p110p0;

import R1.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import p028d6.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15672f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f15673g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15675b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15676c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15677d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f15678e;

    public b(Context context) {
        this.f15674a = context;
        this.f15678e = new c(this, context.getMainLooper(), 3);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f15672f) {
            try {
                if (f15673g == null) {
                    f15673g = new b(context.getApplicationContext());
                }
                bVar = f15673g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean b(Intent intent) {
        ArrayList arrayList;
        int i7;
        String str;
        boolean z4;
        String str2;
        synchronized (this.f15675b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15674a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z7 = true;
                boolean z8 = false;
                Object[] objArr = (intent.getFlags() & 8) != 0;
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f15676c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i8 = 0;
                    while (i8 < arrayList2.size()) {
                        a aVar = (a) arrayList2.get(i8);
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + aVar.f15668a);
                        }
                        if (aVar.f15670c) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z4 = z7;
                        } else {
                            String str3 = action;
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z4 = z7;
                            int iMatch = aVar.f15668a.match(str3, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (objArr != false) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                                aVar.f15670c = z4;
                            } else if (objArr != false) {
                                if (iMatch == -4) {
                                    str2 = "category";
                                } else if (iMatch == -3) {
                                    str2 = "action";
                                } else if (iMatch != -2) {
                                    str2 = iMatch != -1 ? "unknown reason" : "type";
                                } else {
                                    str2 = "data";
                                }
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
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
                            ((a) arrayList3.get(i9)).f15670c = false;
                        }
                        this.f15677d.add(new k(12, intent, arrayList3));
                        if (!this.f15678e.hasMessages(z9 ? 1 : 0)) {
                            this.f15678e.sendEmptyMessage(z9 ? 1 : 0);
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

package com.facebook.appevents.aam;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nMetadataMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataMatcher.kt\ncom/facebook/appevents/aam/MetadataMatcher\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,116:1\n37#2,2:117\n*S KotlinDebug\n*F\n+ 1 MetadataMatcher.kt\ncom/facebook/appevents/aam/MetadataMatcher\n*L\n42#1:117,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();

    @JvmStatic
    public static final ArrayList a(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup i = com.facebook.appevents.codeless.internal.e.i(view);
            if (i != null) {
                Iterator it = com.facebook.appevents.codeless.internal.e.b(i).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
            return null;
        }
    }

    @JvmStatic
    public static final ArrayList b(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.facebook.appevents.codeless.internal.e.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    String[] strArr = (String[]) new Regex(DomExceptionUtils.SEPARATOR).split(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean d(ArrayList indicators, ArrayList keys) {
        boolean contains$default;
        if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            try {
                Intrinsics.checkNotNullParameter(indicators, "indicators");
                Intrinsics.checkNotNullParameter(keys, "keys");
                Iterator it = indicators.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    c cVar = a;
                    cVar.getClass();
                    if (!com.facebook.internal.instrument.crashshield.a.b(cVar)) {
                        try {
                            Iterator it2 = keys.iterator();
                            while (it2.hasNext()) {
                                contains$default = StringsKt__StringsKt.contains$default(str, (String) it2.next(), false, 2, (Object) null);
                                if (contains$default) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, c.class);
                return false;
            }
        }
        return false;
    }

    public final ArrayList c(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = com.facebook.appevents.codeless.internal.e.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }
}

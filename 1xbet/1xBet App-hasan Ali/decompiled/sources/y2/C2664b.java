package y2;

import a.AbstractC0444a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import b2.p;
import java.io.InputStream;
import java.util.List;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC2346c;
import v2.C2534a;
import v2.n;
import v2.o;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2664b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21189a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f21190b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.m f21191c;

    public /* synthetic */ C2664b(Uri uri, E2.m mVar, int i) {
        this.f21189a = i;
        this.f21190b = uri;
        this.f21191c = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0240  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a4.c cVar) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        AssetFileDescriptor openTypedAssetFile;
        Integer y02;
        Drawable drawable;
        Drawable dVar;
        boolean z3 = true;
        v2.e eVar = v2.e.f20404m;
        E2.m mVar = this.f21191c;
        Uri uri = this.f21190b;
        switch (this.f21189a) {
            case 0:
                String d02 = X3.m.d0(X3.m.W(uri.getPathSegments()), "/", null, null, null, 62);
                return new m(new o(N4.b.k(N4.b.W(mVar.f1462a.getAssets().open(d02))), new C2534a()), H2.e.b(MimeTypeMap.getSingleton(), d02), eVar);
            case 1:
                ContentResolver contentResolver = mVar.f1462a.getContentResolver();
                if (kotlin.jvm.internal.l.a(uri.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.l.a(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
                    if (openInputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && kotlin.jvm.internal.l.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.l.a(pathSegments.get(size - 3), "audio") && kotlin.jvm.internal.l.a(pathSegments.get(size - 2), "albums")) {
                    F2.h hVar = mVar.f1465d;
                    AbstractC0444a abstractC0444a = hVar.f1536a;
                    F2.a aVar = abstractC0444a instanceof F2.a ? (F2.a) abstractC0444a : null;
                    if (aVar != null) {
                        AbstractC0444a abstractC0444a2 = hVar.f1537b;
                        F2.a aVar2 = abstractC0444a2 instanceof F2.a ? (F2.a) abstractC0444a2 : null;
                        if (aVar2 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(aVar.f, aVar2.f));
                            openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
                            if (openInputStream == null) {
                                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                            }
                        }
                    }
                    bundle = null;
                    openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (openTypedAssetFile != null) {
                    }
                    if (openInputStream == null) {
                    }
                } else {
                    openInputStream = contentResolver.openInputStream(uri);
                    if (openInputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new m(new o(N4.b.k(N4.b.W(openInputStream)), new C2534a()), contentResolver.getType(uri), eVar);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    String str = AbstractC2227e.H0(authority) ? null : authority;
                    if (str != null) {
                        String str2 = (String) X3.m.f0(uri.getPathSegments());
                        if (str2 == null || (y02 = AbstractC2234l.y0(str2)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + uri);
                        }
                        int intValue = y02.intValue();
                        Context context = mVar.f1462a;
                        Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b3 = H2.e.b(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC2227e.I0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!kotlin.jvm.internal.l.a(b3, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new m(new o(N4.b.k(N4.b.W(resources.openRawResource(intValue, typedValue2))), new n(typedValue2.density)), b3, eVar);
                        }
                        if (str.equals(context.getPackageName())) {
                            drawable = AbstractC2346c.p(context, intValue);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC2107A.q("Invalid resource ID: ", intValue).toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String name = xml.getName();
                                if (kotlin.jvm.internal.l.a(name, "vector")) {
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    Resources.Theme theme = context.getTheme();
                                    dVar = new p();
                                    dVar.inflate(resources, xml, asAttributeSet, theme);
                                } else if (kotlin.jvm.internal.l.a(name, "animated-vector")) {
                                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                                    Resources.Theme theme2 = context.getTheme();
                                    dVar = new b2.d(context);
                                    dVar.inflate(resources, xml, asAttributeSet2, theme2);
                                }
                                drawable = dVar;
                            }
                            Resources.Theme theme3 = context.getTheme();
                            ThreadLocal threadLocal = f1.j.f16961a;
                            drawable = resources.getDrawable(intValue, theme3);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC2107A.q("Invalid resource ID: ", intValue).toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof p)) {
                            z3 = false;
                        }
                        if (z3) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC0444a.x(drawable, mVar.f1463b, mVar.f1465d, mVar.f1466e, mVar.f));
                        }
                        return new d(drawable, z3, eVar);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
        }
    }
}

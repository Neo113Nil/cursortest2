package P;

import android.content.ClipData;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350f implements InterfaceC0349e, InterfaceC0351g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5055a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5056b;

    /* renamed from: c, reason: collision with root package name */
    public int f5057c;

    /* renamed from: d, reason: collision with root package name */
    public int f5058d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5059e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f5060f;

    public /* synthetic */ C0350f() {
        this.f5055a = 0;
    }

    @Override // P.InterfaceC0349e
    public void A(int i7) {
        this.f5058d = i7;
    }

    public void a(Context context, XmlResourceParser xmlResourceParser) {
        B.m mVar = new B.m();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlResourceParser.getAttributeName(i7);
            String attributeValue = xmlResourceParser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                mVar.k(context, xmlResourceParser);
                ((SparseArray) this.f5060f).put(identifier, mVar);
                return;
            }
        }
    }

    @Override // P.InterfaceC0349e
    public C0352h b() {
        return new C0352h(new C0350f(this));
    }

    @Override // P.InterfaceC0351g
    public int c() {
        return this.f5058d;
    }

    @Override // P.InterfaceC0351g
    public ClipData e() {
        return (ClipData) this.f5056b;
    }

    @Override // P.InterfaceC0349e
    public void h(Bundle bundle) {
        this.f5060f = bundle;
    }

    @Override // P.InterfaceC0351g
    public ContentInfo j() {
        return null;
    }

    @Override // P.InterfaceC0351g
    public int k() {
        return this.f5057c;
    }

    @Override // P.InterfaceC0349e
    public void t(Uri uri) {
        this.f5059e = uri;
    }

    public String toString() {
        String str;
        switch (this.f5055a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f5056b).getDescription());
                sb.append(", source=");
                int i7 = this.f5057c;
                sb.append(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i8 = this.f5058d;
                sb.append((i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8));
                Uri uri = (Uri) this.f5059e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return e1.k.i(sb, ((Bundle) this.f5060f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0350f(Context context, ConstraintLayout constraintLayout, int i7) {
        this.f5055a = 2;
        this.f5057c = -1;
        this.f5058d = -1;
        this.f5059e = new SparseArray();
        this.f5060f = new SparseArray();
        this.f5056b = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            int eventType = xml.getEventType();
            B.e eVar = null;
            while (true) {
                char c3 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 2) {
                        eVar = new B.e(context, xml);
                        ((SparseArray) this.f5059e).put(eVar.f776a, eVar);
                    } else if (c3 == 3) {
                        B.f fVar = new B.f(context, xml);
                        if (eVar != null) {
                            eVar.f777b.add(fVar);
                        }
                    } else if (c3 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public C0350f(C0350f c0350f) {
        this.f5055a = 1;
        ClipData clipData = (ClipData) c0350f.f5056b;
        clipData.getClass();
        this.f5056b = clipData;
        int i7 = c0350f.f5057c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 <= 5) {
            this.f5057c = i7;
            int i8 = c0350f.f5058d;
            if ((i8 & 1) == i8) {
                this.f5058d = i8;
                this.f5059e = (Uri) c0350f.f5059e;
                this.f5060f = (Bundle) c0350f.f5060f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}

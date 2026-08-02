package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000.AbstractC0454m1;
import p000.C0042ay;
import p000.C0270h1;
import p000.dd0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f487k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f488a;

    /* JADX INFO: renamed from: b */
    public Object f489b;

    /* JADX INFO: renamed from: c */
    public byte[] f490c;

    /* JADX INFO: renamed from: d */
    public Parcelable f491d;

    /* JADX INFO: renamed from: e */
    public int f492e;

    /* JADX INFO: renamed from: f */
    public int f493f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f494g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f495h;

    /* JADX INFO: renamed from: i */
    public String f496i;

    /* JADX INFO: renamed from: j */
    public String f497j;

    public IconCompat() {
        this.f488a = -1;
        this.f490c = null;
        this.f491d = null;
        this.f492e = 0;
        this.f493f = 0;
        this.f494g = null;
        this.f495h = f487k;
        this.f496i = null;
    }

    /* JADX INFO: renamed from: a */
    public static IconCompat m390a(int i) {
        if (i == 0) {
            C0270h1.m2190f("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f492e = i;
        iconCompat.f489b = "";
        iconCompat.f497j = "";
        return iconCompat;
    }

    /* JADX INFO: renamed from: b */
    public final int m391b() {
        int i = this.f488a;
        if (i == -1) {
            return ((Icon) this.f489b).getResId();
        }
        if (i == 2) {
            return this.f492e;
        }
        C0042ay.m531h(this, "called getResId() on ");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m392c() {
        int i = this.f488a;
        if (i == -1) {
            return ((Icon) this.f489b).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f489b);
        }
        C0042ay.m531h(this, "called getUri() on ");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Icon m393d(Context context) {
        Icon iconCreateWithBitmap;
        String resPackage;
        InputStream inputStreamOpenInputStream;
        int i = this.f488a;
        switch (i) {
            case -1:
                return (Icon) this.f489b;
            case 0:
            default:
                C0270h1.m2190f("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f489b);
                break;
            case 2:
                if (i == -1) {
                    resPackage = ((Icon) this.f489b).getResPackage();
                } else {
                    if (i != 2) {
                        C0042ay.m531h(this, "called getResPackage() on ");
                        return null;
                    }
                    String str = this.f497j;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f489b).split(":", -1)[0] : this.f497j;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, this.f492e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f489b, this.f492e, this.f493f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f489b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f489b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = AbstractC0454m1.m3314a(m392c());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m392c());
                    }
                    Uri uriM392c = m392c();
                    String scheme = uriM392c.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM392c);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM392c, e);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f489b));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM392c, e2);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        dd0.m1166l(m392c(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.f494g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f495h;
        if (mode != f487k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f488a == -1) {
            return String.valueOf(this.f489b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f488a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f488a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f489b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f489b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f497j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m391b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f492e);
                if (this.f493f != 0) {
                    sb.append(" off=");
                    sb.append(this.f493f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f489b);
                break;
        }
        if (this.f494g != null) {
            sb.append(" tint=");
            sb.append(this.f494g);
        }
        if (this.f495h != f487k) {
            sb.append(" mode=");
            sb.append(this.f495h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f490c = null;
        this.f491d = null;
        this.f492e = 0;
        this.f493f = 0;
        this.f494g = null;
        this.f495h = f487k;
        this.f496i = null;
        this.f488a = i;
    }
}

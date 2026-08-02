package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f42081a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f42082b;

    /* renamed from: c, reason: collision with root package name */
    private int f42083c;

    private d(Shader shader, ColorStateList colorStateList, int i11) {
        this.f42081a = shader;
        this.f42082b = colorStateList;
        this.f42083c = i11;
    }

    @NonNull
    private static d a(@NonNull Resources resources, int i11, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return new d(f.a(resources, xml, asAttributeSet, theme), null, 0);
        }
        if (name.equals("selector")) {
            ColorStateList b11 = c.b(resources, xml, asAttributeSet, theme);
            return new d(null, b11, b11.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i11) {
        return new d(null, null, i11);
    }

    public static d e(@NonNull Resources resources, int i11, Resources.Theme theme) {
        try {
            return a(resources, i11, theme);
        } catch (Exception e11) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e11);
            return null;
        }
    }

    public final int c() {
        return this.f42083c;
    }

    public final Shader d() {
        return this.f42081a;
    }

    public final boolean f() {
        return this.f42081a != null;
    }

    public final boolean g() {
        ColorStateList colorStateList;
        return this.f42081a == null && (colorStateList = this.f42082b) != null && colorStateList.isStateful();
    }

    public final boolean h(int[] iArr) {
        if (!g()) {
            return false;
        }
        ColorStateList colorStateList = this.f42082b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f42083c) {
            return false;
        }
        this.f42083c = colorForState;
        return true;
    }

    public final void i(int i11) {
        this.f42083c = i11;
    }

    public final boolean j() {
        return f() || this.f42083c != 0;
    }
}

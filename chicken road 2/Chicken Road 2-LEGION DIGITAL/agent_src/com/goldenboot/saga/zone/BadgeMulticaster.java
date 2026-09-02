package com.goldenboot.saga.zone;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BadgeMulticaster {
    public final Shader evictLayout;
    public final ColorStateList growPayload;
    public int injectMetric;

    public BadgeMulticaster(Shader shader, ColorStateList colorStateList, int i) {
        this.evictLayout = shader;
        this.growPayload = colorStateList;
        this.injectMetric = i;
    }

    public static BadgeMulticaster detachStream(Shader shader) {
        return new BadgeMulticaster(shader, null, 0);
    }

    public static BadgeMulticaster evictLayout(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
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
            return detachStream(SpringRollback.growPayload(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return injectMetric(IconCommand.growPayload(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static BadgeMulticaster flushSample(Resources resources, int i, Resources.Theme theme) {
        try {
            return evictLayout(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BadgeMulticaster growPayload(int i) {
        return new BadgeMulticaster(null, null, i);
    }

    public static BadgeMulticaster injectMetric(ColorStateList colorStateList) {
        return new BadgeMulticaster(null, colorStateList, colorStateList.getDefaultColor());
    }

    public boolean applyTask() {
        ColorStateList colorStateList;
        return this.evictLayout == null && (colorStateList = this.growPayload) != null && colorStateList.isStateful();
    }

    public Shader clipOrigin() {
        return this.evictLayout;
    }

    public boolean connectJob() {
        return updateTimer() || this.injectMetric != 0;
    }

    public void drawField(int i) {
        this.injectMetric = i;
    }

    public boolean popBlueprint(int[] iArr) {
        if (!applyTask()) {
            return false;
        }
        ColorStateList colorStateList = this.growPayload;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.injectMetric) {
            return false;
        }
        this.injectMetric = colorForState;
        return true;
    }

    public int releaseHeader() {
        return this.injectMetric;
    }

    public boolean updateTimer() {
        return this.evictLayout != null;
    }
}

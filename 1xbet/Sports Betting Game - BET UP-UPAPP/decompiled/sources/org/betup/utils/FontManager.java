package org.betup.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;
import org.betup.BetUpApp;

/* loaded from: classes4.dex */
public final class FontManager {
    private static FontManager instance;
    private Map<String, Typeface> fonts = new HashMap();
    private AssetManager mgr;

    private FontManager(AssetManager _mgr) {
        this.mgr = _mgr;
    }

    public static void init(AssetManager mgr) {
        instance = new FontManager(mgr);
    }

    public static FontManager getInstance() {
        if (instance == null) {
            init(BetUpApp.getContext().getAssets());
        }
        return instance;
    }

    public Typeface getFont(String asset) {
        if (this.fonts.containsKey(asset)) {
            return this.fonts.get(asset);
        }
        Typeface typeface = null;
        try {
            typeface = Typeface.createFromAsset(this.mgr, asset);
            this.fonts.put(asset, typeface);
        } catch (Exception unused) {
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            String fixAssetFilename = fixAssetFilename(asset);
            typeface = Typeface.createFromAsset(this.mgr, fixAssetFilename);
            this.fonts.put(asset, typeface);
            this.fonts.put(fixAssetFilename, typeface);
            return typeface;
        } catch (Exception unused2) {
            return typeface;
        }
    }

    private String fixAssetFilename(String asset) {
        return (asset == null || asset.isEmpty() || asset.endsWith(".ttf") || asset.endsWith(".ttc")) ? asset : String.format("%s.ttf", asset);
    }
}

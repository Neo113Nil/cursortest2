package org.betup.utils;

import org.betup.R;

/* loaded from: classes4.dex */
public final class LevelColorFormatter {
    public static int getColorForLevel(int level) {
        return (level < 0 || level > 20 || level < 5) ? R.color.magentaCyanBlack : level < 10 ? R.color.level_9_color : level < 15 ? R.color.level_14_color : R.color.level_20_color;
    }

    public static int getShapeForLevel(int level) {
        return (level < 0 || level > 20 || level < 5) ? R.drawable.level_shape_4 : level < 10 ? R.drawable.level_shape_9 : level < 15 ? R.drawable.level_shape_14 : R.drawable.level_shape_20;
    }

    private LevelColorFormatter() {
    }
}

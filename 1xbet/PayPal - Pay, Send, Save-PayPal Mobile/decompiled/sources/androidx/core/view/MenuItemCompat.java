package androidx.core.view;

/* loaded from: classes3.dex */
public final class MenuItemCompat {

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    @java.lang.Deprecated
    /* loaded from: classes7.dex */
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(android.view.MenuItem menuItem);

        boolean onMenuItemActionExpand(android.view.MenuItem menuItem);
    }

    @androidx.annotation.ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @androidx.annotation.ReplaceWith(expression = "item.setActionView(view)")
    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem menuItem, android.view.View view) {
        return menuItem.setActionView(view);
    }

    @androidx.annotation.ReplaceWith(expression = "item.setActionView(resId)")
    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @androidx.annotation.ReplaceWith(expression = "item.getActionView()")
    @java.lang.Deprecated
    public static android.view.View getActionView(android.view.MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static android.view.MenuItem setActionProvider(android.view.MenuItem menuItem, androidx.core.view.ActionProvider actionProvider) {
        return menuItem instanceof androidx.core.internal.view.SupportMenuItem ? ((androidx.core.internal.view.SupportMenuItem) menuItem).setSupportActionProvider(actionProvider) : menuItem;
    }

    public static androidx.core.view.ActionProvider getActionProvider(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getSupportActionProvider();
        }
        return null;
    }

    @androidx.annotation.ReplaceWith(expression = "item.expandActionView()")
    @java.lang.Deprecated
    public static boolean expandActionView(android.view.MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.ReplaceWith(expression = "item.collapseActionView()")
    @java.lang.Deprecated
    public static boolean collapseActionView(android.view.MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @androidx.annotation.ReplaceWith(expression = "item.isActionViewExpanded()")
    @java.lang.Deprecated
    public static boolean isActionViewExpanded(android.view.MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setOnActionExpandListener(android.view.MenuItem menuItem, final androidx.core.view.MenuItemCompat.OnActionExpandListener onActionExpandListener) {
        return menuItem.setOnActionExpandListener(new android.view.MenuItem.OnActionExpandListener() { // from class: androidx.core.view.MenuItemCompat.1
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(android.view.MenuItem menuItem2) {
                return androidx.core.view.MenuItemCompat.OnActionExpandListener.this.onMenuItemActionExpand(menuItem2);
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem2) {
                return androidx.core.view.MenuItemCompat.OnActionExpandListener.this.onMenuItemActionCollapse(menuItem2);
            }
        });
    }

    public static void setContentDescription(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.Camera2StreamConfigurationMap(menuItem, charSequence);
        }
    }

    public static java.lang.CharSequence getContentDescription(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getContentDescription();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.Camera2StreamConfigurationMap(menuItem);
    }

    public static void setTooltipText(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(menuItem, charSequence);
        }
    }

    public static java.lang.CharSequence getTooltipText(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getTooltipText();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoSizesFor(menuItem);
    }

    public static void setShortcut(android.view.MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setShortcut(c, c2, i, i2);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(menuItem, c, c2, i, i2);
        }
    }

    public static void setNumericShortcut(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRanges(menuItem, c, i);
        }
    }

    public static int getNumericModifiers(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getNumericModifiers();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(menuItem);
    }

    public static void setAlphabeticShortcut(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoSizes(menuItem, c, i);
        }
    }

    public static int getAlphabeticModifiers(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getAlphabeticModifiers();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoSizes(menuItem);
    }

    public static void setIconTintList(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(menuItem, colorStateList);
        }
    }

    public static android.content.res.ColorStateList getIconTintList(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getIconTintList();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRanges(menuItem);
    }

    public static void setIconTintMode(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setIconTintMode(mode);
        } else {
            androidx.core.view.MenuItemCompat.Api26Impl.Camera2StreamConfigurationMap(menuItem, mode);
        }
    }

    public static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getIconTintMode();
        }
        return androidx.core.view.MenuItemCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(menuItem);
    }

    private MenuItemCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.view.MenuItem Camera2StreamConfigurationMap(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static java.lang.CharSequence Camera2StreamConfigurationMap(android.view.MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static android.view.MenuItem getHighSpeedVideoFpsRangesFor(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        static java.lang.CharSequence getHighSpeedVideoSizesFor(android.view.MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static android.view.MenuItem getHighSpeedVideoFpsRangesFor(android.view.MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        static android.view.MenuItem getHighSpeedVideoFpsRanges(android.view.MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.view.MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static android.view.MenuItem getHighSpeedVideoSizes(android.view.MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        static int getHighSpeedVideoSizes(android.view.MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static android.view.MenuItem getHighSpeedVideoFpsRangesFor(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static android.content.res.ColorStateList getHighSpeedVideoFpsRanges(android.view.MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static android.view.MenuItem Camera2StreamConfigurationMap(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor(android.view.MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
    }
}

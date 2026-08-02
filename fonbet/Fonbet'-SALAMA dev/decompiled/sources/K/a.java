package K;

import P.AbstractC0347c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: classes.dex */
public interface a extends MenuItem {
    a c(AbstractC0347c abstractC0347c);

    AbstractC0347c d();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c3, int i7);

    @Override // android.view.MenuItem
    a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c3, int i7);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c3, char c4, int i7, int i8);

    @Override // android.view.MenuItem
    a setTooltipText(CharSequence charSequence);
}

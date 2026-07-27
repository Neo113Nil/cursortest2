package l;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.chicken.jump.road.pump.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import t.AbstractC1206a;

/* loaded from: classes.dex */
public final class f0 extends I.c implements View.OnClickListener {
    public static final /* synthetic */ int y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f9776i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9777j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f9778k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f9779l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f9780m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f9781n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f9782o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9783p;

    /* renamed from: q, reason: collision with root package name */
    public int f9784q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f9785r;

    /* renamed from: s, reason: collision with root package name */
    public int f9786s;

    /* renamed from: t, reason: collision with root package name */
    public int f9787t;

    /* renamed from: u, reason: collision with root package name */
    public int f9788u;

    /* renamed from: v, reason: collision with root package name */
    public int f9789v;

    /* renamed from: w, reason: collision with root package name */
    public int f9790w;

    /* renamed from: x, reason: collision with root package name */
    public int f9791x;

    public f0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f566b = true;
        this.f567c = null;
        this.f565a = false;
        this.f568d = context;
        this.f569e = -1;
        this.f = new I.a(this);
        this.f570g = new I.b(0, this);
        this.f9777j = suggestionRowLayout;
        this.f9776i = suggestionRowLayout;
        this.f9778k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f9784q = 1;
        this.f9786s = -1;
        this.f9787t = -1;
        this.f9788u = -1;
        this.f9789v = -1;
        this.f9790w = -1;
        this.f9791x = -1;
        this.f9779l = searchView;
        this.f9780m = searchableInfo;
        this.f9783p = searchView.getSuggestionCommitIconResId();
        this.f9781n = context;
        this.f9782o = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    @Override // I.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        e0 e0Var = (e0) view.getTag();
        int i3 = this.f9791x;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = e0Var.f9769a;
        if (textView != null) {
            String h3 = h(cursor, this.f9786s);
            textView.setText(h3);
            if (TextUtils.isEmpty(h3)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = e0Var.f9770b;
        if (textView2 != null) {
            String h4 = h(cursor, this.f9788u);
            if (h4 != null) {
                if (this.f9785r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f568d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f9785r = this.f568d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h4);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f9785r, null), 0, h4.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f9787t);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = e0Var.f9771c;
        if (imageView != null) {
            int i5 = this.f9789v;
            if (i5 == -1) {
                f = null;
            } else {
                f = f(cursor.getString(i5));
                if (f == null) {
                    ComponentName searchActivity = this.f9780m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f9782o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f = constantState == null ? null : constantState.newDrawable(this.f9781n.getResources());
                    } else {
                        PackageManager packageManager = this.f568d.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.w("SuggestionsAdapter", e3.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f = drawable;
                                weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                            }
                        }
                        f = null;
                        weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                    }
                    if (f == null) {
                        f = this.f568d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f);
            if (f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f.setVisible(false, false);
                f.setVisible(true, false);
            }
        }
        ImageView imageView2 = e0Var.f9772d;
        if (imageView2 != null) {
            int i6 = this.f9790w;
            Drawable f3 = i6 == -1 ? null : f(cursor.getString(i6));
            imageView2.setImageDrawable(f3);
            if (f3 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        int i7 = this.f9784q;
        ImageView imageView3 = e0Var.f9773e;
        if (i7 != 2 && (i7 != 1 || (i4 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // I.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f9786s = cursor.getColumnIndex("suggest_text_1");
                this.f9787t = cursor.getColumnIndex("suggest_text_2");
                this.f9788u = cursor.getColumnIndex("suggest_text_2_url");
                this.f9789v = cursor.getColumnIndex("suggest_icon_1");
                this.f9790w = cursor.getColumnIndex("suggest_icon_2");
                this.f9791x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // I.c
    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f9780m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // I.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f9778k.inflate(this.f9776i, viewGroup, false);
        inflate.setTag(new e0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f9783p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f568d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f9782o;
        Context context = this.f9781n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable b3 = AbstractC1206a.b(context, parseInt);
                if (b3 != null) {
                    weakHashMap.put(str2, b3.getConstantState());
                }
                return b3;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e3.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e4) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e4);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } finally {
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f568d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // I.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.f9778k.inflate(this.f9777j, viewGroup, false);
            if (inflate != null) {
                ((e0) inflate.getTag()).f9769a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // I.c, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d3 = d(viewGroup);
            ((e0) d3.getTag()).f9769a.setText(e3.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f567c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f567c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9779l.n((CharSequence) tag);
        }
    }
}

package androidx.appcompat.widget;

import W5.AbstractC0486a1;
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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class U0 extends Y.c implements View.OnClickListener {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f8556O = 0;

    /* renamed from: A, reason: collision with root package name */
    public final LayoutInflater f8557A;

    /* renamed from: B, reason: collision with root package name */
    public final SearchView f8558B;

    /* renamed from: C, reason: collision with root package name */
    public final SearchableInfo f8559C;

    /* renamed from: D, reason: collision with root package name */
    public final Context f8560D;

    /* renamed from: E, reason: collision with root package name */
    public final WeakHashMap f8561E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8562F;

    /* renamed from: G, reason: collision with root package name */
    public int f8563G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f8564H;

    /* renamed from: I, reason: collision with root package name */
    public int f8565I;

    /* renamed from: J, reason: collision with root package name */
    public int f8566J;

    /* renamed from: K, reason: collision with root package name */
    public int f8567K;

    /* renamed from: L, reason: collision with root package name */
    public int f8568L;

    /* renamed from: M, reason: collision with root package name */
    public int f8569M;

    /* renamed from: N, reason: collision with root package name */
    public int f8570N;

    /* renamed from: y, reason: collision with root package name */
    public final int f8571y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8572z;

    public U0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f7639b = true;
        this.f7640c = null;
        this.f7638a = false;
        this.f7641d = -1;
        this.f7642e = new Y.a(this);
        this.f7643f = new Y.b(this, 0);
        this.f8572z = suggestionRowLayout;
        this.f8571y = suggestionRowLayout;
        this.f8557A = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8563G = 1;
        this.f8565I = -1;
        this.f8566J = -1;
        this.f8567K = -1;
        this.f8568L = -1;
        this.f8569M = -1;
        this.f8570N = -1;
        this.f8558B = searchView;
        this.f8559C = searchableInfo;
        this.f8562F = searchView.getSuggestionCommitIconResId();
        this.f8560D = context;
        this.f8561E = weakHashMap;
    }

    public static String h(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    @Override // Y.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i7;
        int i8;
        ImageView imageView;
        Drawable f7;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        T0 t02 = (T0) view.getTag();
        int i9 = this.f8570N;
        int i10 = i9 != -1 ? cursor.getInt(i9) : 0;
        TextView textView = t02.f8504a;
        if (textView != null) {
            String h6 = h(cursor, this.f8565I);
            textView.setText(h6);
            if (TextUtils.isEmpty(h6)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f8560D;
        TextView textView2 = t02.f8505b;
        if (textView2 != null) {
            String h7 = h(cursor, this.f8567K);
            if (h7 != null) {
                if (this.f8564H == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f8564H = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h7);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f8564H, null), 0, h7.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f8566J);
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
        ImageView imageView2 = t02.f8506c;
        if (imageView2 != null) {
            int i11 = this.f8568L;
            if (i11 == -1) {
                f7 = null;
            } else {
                f7 = f(cursor.getString(i11));
                if (f7 == null) {
                    ComponentName searchActivity = this.f8559C.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f8561E;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f7 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.w("SuggestionsAdapter", e7.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder j = AbstractC0486a1.j(iconResource, "Invalid icon resource ", " for ");
                                j.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", j.toString());
                            } else {
                                f7 = drawable;
                                weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                            }
                        }
                        f7 = null;
                        weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                    }
                    if (f7 == null) {
                        f7 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f7);
            if (f7 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f7.setVisible(false, false);
                f7.setVisible(true, false);
            }
        }
        ImageView imageView3 = t02.f8507d;
        if (imageView3 != null) {
            int i12 = this.f8569M;
            Drawable f8 = i12 == -1 ? null : f(cursor.getString(i12));
            imageView3.setImageDrawable(f8);
            if (f8 != null) {
                imageView3.setVisibility(0);
                f8.setVisible(false, false);
                i7 = 1;
                f8.setVisible(true, false);
                i8 = this.f8563G;
                imageView = t02.f8508e;
                if (i8 == 2 && (i8 != i7 || (i10 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i7 = 1;
        i8 = this.f8563G;
        imageView = t02.f8508e;
        if (i8 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // Y.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f8565I = cursor.getColumnIndex("suggest_text_1");
                this.f8566J = cursor.getColumnIndex("suggest_text_2");
                this.f8567K = cursor.getColumnIndex("suggest_text_2_url");
                this.f8568L = cursor.getColumnIndex("suggest_icon_1");
                this.f8569M = cursor.getColumnIndex("suggest_icon_2");
                this.f8570N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // Y.c
    public final String c(Cursor cursor) {
        String h6;
        String h7;
        if (cursor == null) {
            return null;
        }
        String h8 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h8 != null) {
            return h8;
        }
        SearchableInfo searchableInfo = this.f8559C;
        if (searchableInfo.shouldRewriteQueryFromData() && (h7 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h7;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h6 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h6;
    }

    @Override // Y.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f8557A.inflate(this.f8571y, viewGroup, false);
        inflate.setTag(new T0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f8562F);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8560D.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f8561E;
        Context context = this.f8560D;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = G.h.getDrawable(context, parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
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
                } catch (FileNotFoundException e7) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e7.getMessage());
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
                        } catch (IOException e8) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e8);
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
        return this.f8560D.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // Y.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.f8557A.inflate(this.f8572z, viewGroup, false);
            if (inflate != null) {
                ((T0) inflate.getTag()).f8504a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // Y.c, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View d7 = d(viewGroup);
            ((T0) d7.getTag()).f8504a.setText(e7.toString());
            return d7;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f7640c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f7640c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8558B.q((CharSequence) tag);
        }
    }
}

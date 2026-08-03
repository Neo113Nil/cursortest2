package h;

/* loaded from: classes.dex */
public final class d0 extends D.c implements android.view.View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f3133y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f3134i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3135j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.LayoutInflater f3136k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.appcompat.widget.SearchView f3137l;

    /* renamed from: m, reason: collision with root package name */
    public final android.app.SearchableInfo f3138m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f3139n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.WeakHashMap f3140o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3141p;

    /* renamed from: q, reason: collision with root package name */
    public int f3142q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f3143r;

    /* renamed from: s, reason: collision with root package name */
    public int f3144s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f3145u;

    /* renamed from: v, reason: collision with root package name */
    public int f3146v;

    /* renamed from: w, reason: collision with root package name */
    public int f3147w;

    /* renamed from: x, reason: collision with root package name */
    public int f3148x;

    public d0(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f186b = true;
        this.f187c = null;
        this.f185a = false;
        this.f188d = context;
        this.f189e = -1;
        this.f190f = new D.a(this);
        this.f191g = new D.b(0, this);
        this.f3135j = suggestionRowLayout;
        this.f3134i = suggestionRowLayout;
        this.f3136k = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.f3142q = 1;
        this.f3144s = -1;
        this.t = -1;
        this.f3145u = -1;
        this.f3146v = -1;
        this.f3147w = -1;
        this.f3148x = -1;
        this.f3137l = searchView;
        this.f3138m = searchableInfo;
        this.f3141p = searchView.getSuggestionCommitIconResId();
        this.f3139n = context;
        this.f3140o = weakHashMap;
    }

    public static java.lang.String h(android.database.Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    @Override // D.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(android.view.View view, android.database.Cursor cursor) {
        android.graphics.drawable.Drawable f2;
        android.content.pm.ActivityInfo activityInfo;
        int iconResource;
        java.lang.String str;
        h.c0 c0Var = (h.c0) view.getTag();
        int i2 = this.f3148x;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        android.widget.TextView textView = c0Var.f3128a;
        if (textView != null) {
            java.lang.String h2 = h(cursor, this.f3144s);
            textView.setText(h2);
            if (android.text.TextUtils.isEmpty(h2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        android.widget.TextView textView2 = c0Var.f3129b;
        if (textView2 != null) {
            java.lang.String h3 = h(cursor, this.f3145u);
            if (h3 != null) {
                if (this.f3143r == null) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    this.f188d.getTheme().resolveAttribute(com.watchfacestudio.huasi_urx110.R.attr.textColorSearchUrl, typedValue, true);
                    this.f3143r = this.f188d.getResources().getColorStateList(typedValue.resourceId);
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(h3);
                spannableString.setSpan(new android.text.style.TextAppearanceSpan(null, 0, 0, this.f3143r, null), 0, h3.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.t);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (android.text.TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = c0Var.f3130c;
        if (imageView != null) {
            int i4 = this.f3146v;
            if (i4 == -1) {
                f2 = null;
            } else {
                f2 = f(cursor.getString(i4));
                if (f2 == null) {
                    android.content.ComponentName searchActivity = this.f3138m.getSearchActivity();
                    java.lang.String flattenToShortString = searchActivity.flattenToShortString();
                    java.util.WeakHashMap weakHashMap = this.f3140o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f2 = constantState == null ? null : constantState.newDrawable(this.f3139n.getResources());
                    } else {
                        android.content.pm.PackageManager packageManager = this.f188d.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                            android.util.Log.w("SuggestionsAdapter", e2.toString());
                        }
                        if (iconResource != 0) {
                            android.graphics.drawable.Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                android.util.Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f2 = drawable;
                                weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                            }
                        }
                        f2 = null;
                        weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                    }
                    if (f2 == null) {
                        f2 = this.f188d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f2);
            if (f2 == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f2.setVisible(false, false);
                f2.setVisible(true, false);
            }
        }
        android.widget.ImageView imageView2 = c0Var.f3131d;
        if (imageView2 != null) {
            int i5 = this.f3147w;
            android.graphics.drawable.Drawable f3 = i5 == -1 ? null : f(cursor.getString(i5));
            imageView2.setImageDrawable(f3);
            if (f3 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        int i6 = this.f3142q;
        android.widget.ImageView imageView3 = c0Var.f3132e;
        if (i6 != 2 && (i6 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // D.c
    public final void b(android.database.Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3144s = cursor.getColumnIndex("suggest_text_1");
                this.t = cursor.getColumnIndex("suggest_text_2");
                this.f3145u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3146v = cursor.getColumnIndex("suggest_icon_1");
                this.f3147w = cursor.getColumnIndex("suggest_icon_2");
                this.f3148x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // D.c
    public final java.lang.String c(android.database.Cursor cursor) {
        java.lang.String h2;
        java.lang.String h3;
        if (cursor == null) {
            return null;
        }
        java.lang.String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        android.app.SearchableInfo searchableInfo = this.f3138m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // D.c
    public final android.view.View d(android.view.ViewGroup viewGroup) {
        android.view.View inflate = this.f3136k.inflate(this.f3134i, viewGroup, false);
        inflate.setTag(new h.c0(inflate));
        ((android.widget.ImageView) inflate.findViewById(com.watchfacestudio.huasi_urx110.R.id.edit_query)).setImageResource(this.f3141p);
        return inflate;
    }

    public final android.graphics.drawable.Drawable e(android.net.Uri uri) {
        int parseInt;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: " + uri);
        }
        try {
            android.content.res.Resources resourcesForApplication = this.f188d.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new java.io.FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new java.io.FileNotFoundException("No resource found for: " + uri);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.drawable.Drawable f(java.lang.String str) {
        java.util.WeakHashMap weakHashMap = this.f3140o;
        android.content.Context context = this.f3139n;
        android.graphics.drawable.Drawable drawable = null;
        if (str != null && !str.isEmpty() && !io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            try {
                int parseInt = java.lang.Integer.parseInt(str);
                java.lang.String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakHashMap.get(str2);
                android.graphics.drawable.Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                android.graphics.drawable.Drawable b2 = p.AbstractC0944a.b(context, parseInt);
                if (b2 != null) {
                    weakHashMap.put(str2, b2.getConstantState());
                }
                return b2;
            } catch (android.content.res.Resources.NotFoundException unused) {
                android.util.Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (java.lang.NumberFormatException unused2) {
                android.graphics.drawable.Drawable.ConstantState constantState2 = (android.graphics.drawable.Drawable.ConstantState) weakHashMap.get(str);
                android.graphics.drawable.Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                android.net.Uri parse = android.net.Uri.parse(str);
                try {
                } catch (java.io.FileNotFoundException e2) {
                    android.util.Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
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
                    } catch (android.content.res.Resources.NotFoundException unused3) {
                        throw new java.io.FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    java.io.InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new java.io.FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        android.graphics.drawable.Drawable createFromStream = android.graphics.drawable.Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (java.io.IOException e3) {
                            android.util.Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
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

    public final android.database.Cursor g(android.app.SearchableInfo searchableInfo, java.lang.String str) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        android.net.Uri.Builder fragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        java.lang.String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new java.lang.String[]{str};
        } else {
            fragment.appendPath(str);
        }
        java.lang.String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", java.lang.String.valueOf(50));
        return this.f188d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // D.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (java.lang.RuntimeException e2) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            android.view.View inflate = this.f3136k.inflate(this.f3135j, viewGroup, false);
            if (inflate != null) {
                ((h.c0) inflate.getTag()).f3128a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // D.c, android.widget.Adapter
    public final android.view.View getView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (java.lang.RuntimeException e2) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            android.view.View d2 = d(viewGroup);
            ((h.c0) d2.getTag()).f3128a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.database.Cursor cursor = this.f187c;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.database.Cursor cursor = this.f187c;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.f3137l.n((java.lang.CharSequence) tag);
        }
    }
}

package androidx.appcompat.widget;

/* loaded from: classes5.dex */
class SuggestionsAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter implements android.view.View.OnClickListener {
    int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final android.content.Context getInputFormats;
    private final androidx.appcompat.widget.SearchView getInputSizeshNQ4ISI;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> getOutputFormats;
    private final android.app.SearchableInfo getOutputMinFrameDuration;
    private android.content.res.ColorStateList getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[Catch: RuntimeException -> 0x007a, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007a, blocks: (B:9:0x001b, B:13:0x0076, B:17:0x0021, B:20:0x0028, B:22:0x0045, B:23:0x0048, B:25:0x0053, B:26:0x005d, B:27:0x0059), top: B:8:0x001b }] */
    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence charSequence) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr;
        android.database.Cursor query;
        java.lang.String obj = charSequence == null ? "" : charSequence.toString();
        if (this.getInputSizeshNQ4ISI.getVisibility() == 0 && this.getInputSizeshNQ4ISI.getWindowVisibility() == 0) {
            try {
                android.app.SearchableInfo searchableInfo = this.getOutputMinFrameDuration;
                if (searchableInfo != null && (suggestAuthority = searchableInfo.getSuggestAuthority()) != null) {
                    android.net.Uri.Builder fragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    java.lang.String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new java.lang.String[]{obj};
                    } else {
                        fragment.appendPath(obj);
                        strArr = null;
                    }
                    fragment.appendQueryParameter("limit", "50");
                    query = this.getInputFormats.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
                    if (query != null) {
                        query.getCount();
                        return query;
                    }
                }
                query = null;
                if (query != null) {
                }
            } catch (java.lang.RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.database.Cursor cursor = getCursor();
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.database.Cursor cursor = getCursor();
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(android.database.Cursor cursor) {
        if (this.getHighSpeedVideoFpsRanges) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.getOutputStallDurationlomOqCM = cursor.getColumnIndex("suggest_text_1");
                this.getOutputStallDuration = cursor.getColumnIndex("suggest_text_2");
                this.getOutputSizes = cursor.getColumnIndex("suggest_text_2_url");
                this.getHighSpeedVideoSizes = cursor.getColumnIndex("suggest_icon_1");
                this.getHighSpeedVideoSizesFor = cursor.getColumnIndex("suggest_icon_2");
                this.getHighResolutionOutputSizeshNQ4ISI = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        android.view.View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache(newView));
        ((android.widget.ImageView) newView.findViewById(androidx.appcompat.R.id.edit_query)).setImageResource(this.getHighSpeedVideoFpsRangesFor);
        return newView;
    }

    static final class ChildViewCache {
        public final android.widget.TextView Camera2StreamConfigurationMap;
        public final android.widget.ImageView getHighResolutionOutputSizeshNQ4ISI;
        public final android.widget.TextView getHighSpeedVideoFpsRanges;
        public final android.widget.ImageView getHighSpeedVideoFpsRangesFor;
        public final android.widget.ImageView getHighSpeedVideoSizes;

        public ChildViewCache(android.view.View view) {
            this.Camera2StreamConfigurationMap = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.getHighSpeedVideoFpsRanges = (android.widget.TextView) view.findViewById(android.R.id.text2);
            this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.ImageView) view.findViewById(android.R.id.icon1);
            this.getHighSpeedVideoFpsRangesFor = (android.widget.ImageView) view.findViewById(android.R.id.icon2);
            this.getHighSpeedVideoSizes = (android.widget.ImageView) view.findViewById(androidx.appcompat.R.id.edit_query);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
        android.graphics.drawable.Drawable highSpeedVideoFpsRanges;
        java.lang.String str;
        androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache childViewCache = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) view.getTag();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (childViewCache.Camera2StreamConfigurationMap != null) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(cursor, this.getOutputStallDurationlomOqCM);
            android.widget.TextView textView = childViewCache.Camera2StreamConfigurationMap;
            textView.setText(highSpeedVideoSizes);
            if (android.text.TextUtils.isEmpty(highSpeedVideoSizes)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (childViewCache.getHighSpeedVideoFpsRanges != null) {
            java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(cursor, this.getOutputSizes);
            if (highSpeedVideoSizes2 == null) {
                str = getHighSpeedVideoSizes(cursor, this.getOutputStallDuration);
            } else {
                if (this.getOutputMinFrameDurationlomOqCM == null) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    this.getInputFormats.getTheme().resolveAttribute(androidx.appcompat.R.attr.textColorSearchUrl, typedValue, true);
                    this.getOutputMinFrameDurationlomOqCM = this.getInputFormats.getResources().getColorStateList(typedValue.resourceId);
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(highSpeedVideoSizes2);
                spannableString.setSpan(new android.text.style.TextAppearanceSpan(null, 0, 0, this.getOutputMinFrameDurationlomOqCM, null), 0, highSpeedVideoSizes2.length(), 33);
                str = spannableString;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                if (childViewCache.Camera2StreamConfigurationMap != null) {
                    childViewCache.Camera2StreamConfigurationMap.setSingleLine(false);
                    childViewCache.Camera2StreamConfigurationMap.setMaxLines(2);
                }
            } else if (childViewCache.Camera2StreamConfigurationMap != null) {
                childViewCache.Camera2StreamConfigurationMap.setSingleLine(true);
                childViewCache.Camera2StreamConfigurationMap.setMaxLines(1);
            }
            android.widget.TextView textView2 = childViewCache.getHighSpeedVideoFpsRanges;
            textView2.setText(str);
            if (android.text.TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        if (childViewCache.getHighResolutionOutputSizeshNQ4ISI != null) {
            android.widget.ImageView imageView = childViewCache.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 == -1) {
                highSpeedVideoFpsRanges = null;
            } else {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cursor.getString(i3));
                if (highSpeedVideoFpsRanges == null) {
                    android.content.ComponentName searchActivity = this.getOutputMinFrameDuration.getSearchActivity();
                    java.lang.String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.getOutputFormats.containsKey(flattenToShortString)) {
                        android.graphics.drawable.Drawable.ConstantState constantState = this.getOutputFormats.get(flattenToShortString);
                        highSpeedVideoFpsRanges = constantState == null ? null : constantState.newDrawable(this.getInputFormats.getResources());
                    } else {
                        highSpeedVideoFpsRanges = getHighSpeedVideoSizes(searchActivity);
                        this.getOutputFormats.put(flattenToShortString, highSpeedVideoFpsRanges == null ? null : highSpeedVideoFpsRanges.getConstantState());
                    }
                    if (highSpeedVideoFpsRanges == null) {
                        highSpeedVideoFpsRanges = this.getInputFormats.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(imageView, highSpeedVideoFpsRanges, 4);
        }
        if (childViewCache.getHighSpeedVideoFpsRangesFor != null) {
            android.widget.ImageView imageView2 = childViewCache.getHighSpeedVideoFpsRangesFor;
            int i4 = this.getHighSpeedVideoSizesFor;
            getHighResolutionOutputSizeshNQ4ISI(imageView2, i4 != -1 ? getHighSpeedVideoFpsRanges(cursor.getString(i4)) : null, 8);
        }
        int i5 = this.Camera2StreamConfigurationMap;
        if (i5 == 2 || (i5 == 1 && (i2 & 1) != 0)) {
            childViewCache.getHighSpeedVideoSizes.setVisibility(0);
            childViewCache.getHighSpeedVideoSizes.setTag(childViewCache.Camera2StreamConfigurationMap.getText());
            childViewCache.getHighSpeedVideoSizes.setOnClickListener(this);
            return;
        }
        childViewCache.getHighSpeedVideoSizes.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.getInputSizeshNQ4ISI.onQueryRefine((java.lang.CharSequence) tag);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor cursor) {
        java.lang.String highSpeedVideoSizes;
        java.lang.String highSpeedVideoSizes2;
        if (cursor == null) {
            return null;
        }
        java.lang.String highSpeedVideoSizes3 = getHighSpeedVideoSizes(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (highSpeedVideoSizes3 != null) {
            return highSpeedVideoSizes3;
        }
        if (this.getOutputMinFrameDuration.shouldRewriteQueryFromData() && (highSpeedVideoSizes2 = getHighSpeedVideoSizes(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return highSpeedVideoSizes2;
        }
        if (!this.getOutputMinFrameDuration.shouldRewriteQueryFromText() || (highSpeedVideoSizes = getHighSpeedVideoSizes(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return highSpeedVideoSizes;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (java.lang.RuntimeException e) {
            android.view.View newView = newView(this.getInputFormats, getCursor(), viewGroup);
            if (newView != null) {
                ((androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) newView.getTag()).Camera2StreamConfigurationMap.setText(e.toString());
            }
            return newView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (java.lang.RuntimeException e) {
            android.view.View newDropDownView = newDropDownView(this.getInputFormats, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) newDropDownView.getTag()).Camera2StreamConfigurationMap.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = java.lang.Integer.parseInt(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("android.resource://");
                sb.append(this.getInputFormats.getPackageName());
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(parseInt);
                java.lang.String obj = sb.toString();
                android.graphics.drawable.Drawable.ConstantState constantState = this.getOutputFormats.get(obj);
                android.graphics.drawable.Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(this.getInputFormats, parseInt);
                if (drawable != null) {
                    this.getOutputFormats.put(obj, drawable.getConstantState());
                }
                return drawable;
            } catch (android.content.res.Resources.NotFoundException unused) {
                return null;
            } catch (java.lang.NumberFormatException unused2) {
                android.graphics.drawable.Drawable.ConstantState constantState2 = this.getOutputFormats.get(str);
                r0 = constantState2 != null ? constantState2.newDrawable() : null;
                if (r0 != null) {
                    return r0;
                }
                r0 = getHighResolutionOutputSizeshNQ4ISI(android.net.Uri.parse(str));
                if (r0 != null) {
                    this.getOutputFormats.put(str, r0.getConstantState());
                }
            }
        }
        return r0;
    }

    private android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return Camera2StreamConfigurationMap(uri);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource does not exist: ");
                    sb.append(uri);
                    throw new java.io.FileNotFoundException(sb.toString());
                }
            }
            java.io.InputStream openInputStream = this.getInputFormats.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to open ");
                sb2.append(uri);
                throw new java.io.FileNotFoundException(sb2.toString());
            }
            try {
                return android.graphics.drawable.Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
        } catch (java.io.FileNotFoundException e) {
            e.getMessage();
            return null;
        }
        e.getMessage();
        return null;
    }

    private android.graphics.drawable.Drawable getHighSpeedVideoSizes(android.content.ComponentName componentName) {
        android.content.pm.PackageManager packageManager = this.getInputFormats.getPackageManager();
        try {
            android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            android.graphics.drawable.Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static java.lang.String getHighSpeedVideoFpsRanges(android.database.Cursor cursor, java.lang.String str) {
        return getHighSpeedVideoSizes(cursor, cursor.getColumnIndex(str));
    }

    private static java.lang.String getHighSpeedVideoSizes(android.database.Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap(android.net.Uri uri) throws java.io.FileNotFoundException {
        int parseInt;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: ".concat(java.lang.String.valueOf(uri)));
        }
        try {
            android.content.res.Resources resourcesForApplication = this.getInputFormats.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: ".concat(java.lang.String.valueOf(uri)));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: ".concat(java.lang.String.valueOf(uri)));
                }
            } else if (size == 2) {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new java.io.FileNotFoundException("More than two path segments: ".concat(java.lang.String.valueOf(uri)));
            }
            if (parseInt == 0) {
                throw new java.io.FileNotFoundException("No resource found for: ".concat(java.lang.String.valueOf(uri)));
            }
            return resourcesForApplication.getDrawable(parseInt);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: ".concat(java.lang.String.valueOf(uri)));
        }
    }

    public SuggestionsAdapter(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getOutputStallDurationlomOqCM, (android.database.Cursor) null, true);
        this.getHighSpeedVideoFpsRanges = false;
        this.Camera2StreamConfigurationMap = 1;
        this.getOutputStallDurationlomOqCM = -1;
        this.getOutputStallDuration = -1;
        this.getOutputSizes = -1;
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoSizesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = searchView;
        this.getOutputMinFrameDuration = searchableInfo;
        this.getHighSpeedVideoFpsRangesFor = searchView.getOutputSizeshNQ4ISI;
        this.getInputFormats = context;
        this.getOutputFormats = weakHashMap;
    }
}

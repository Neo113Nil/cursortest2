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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends Y.c implements View.OnClickListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f8556O = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LayoutInflater f8557A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SearchView f8558B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SearchableInfo f8559C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Context f8560D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final WeakHashMap f8561E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8562F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8563G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f8564H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f8565I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f8566J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f8567K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f8568L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f8569M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f8570N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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

    @Override // Y.c
    public final void a(View view, Cursor cursor) {
        int i7;
        Drawable drawableF;
        CharSequence charSequenceH;
        T0 t7 = (T0) view.getTag();
        int i8 = this.f8570N;
        int i9 = i8 != -1 ? cursor.getInt(i8) : 0;
        TextView textView = t7.f8504a;
        if (textView != null) {
            String strH = h(cursor, this.f8565I);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f8560D;
        TextView textView2 = t7.f8505b;
        if (textView2 != null) {
            String strH2 = h(cursor, this.f8567K);
            if (strH2 != null) {
                if (this.f8564H == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f8564H = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f8564H, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f8566J);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = t7.f8506c;
        if (imageView != null) {
            int i10 = this.f8568L;
            if (i10 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i10));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f8559C.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f8561E;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbJ = AbstractC0486a1.j(iconResource, "Invalid icon resource ", " for ");
                                    sbJ.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbJ.toString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.w("SuggestionsAdapter", e7.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView2 = t7.f8507d;
        if (imageView2 == null) {
            i7 = 1;
        } else {
            int i11 = this.f8569M;
            Drawable drawableF2 = i11 == -1 ? null : f(cursor.getString(i11));
            imageView2.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView2.setVisibility(8);
                i7 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableF2.setVisible(false, false);
                i7 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i12 = this.f8563G;
        ImageView imageView3 = t7.f8508e;
        if (i12 != 2 && (i12 != i7 || (i9 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
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
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f8559C;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // Y.c
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f8557A.inflate(this.f8571y, viewGroup, false);
        viewInflate.setTag(new T0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f8562F);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
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
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f8561E;
        Context context = this.f8560D;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i7 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i7;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = G.h.getDrawable(context, i7);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e7) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e7);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e8) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e9) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
                    if (drawableE != null) {
                        weakHashMap.put(str, drawableE.getConstantState());
                    }
                    return drawableE;
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f8560D.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // Y.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewInflate = this.f8557A.inflate(this.f8572z, viewGroup, false);
            if (viewInflate != null) {
                ((T0) viewInflate.getTag()).f8504a.setText(e7.toString());
            }
            return viewInflate;
        }
    }

    @Override // Y.c, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewD = d(viewGroup);
            ((T0) viewD.getTag()).f8504a.setText(e7.toString());
            return viewD;
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

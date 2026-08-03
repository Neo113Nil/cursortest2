package androidx.preference;

/* loaded from: classes.dex */
public class DropDownPreference extends androidx.preference.ListPreference {

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ArrayAdapter f2418j;

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.dropdownPreferenceStyle);
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f2418j = arrayAdapter;
        arrayAdapter.clear();
        java.lang.CharSequence[] charSequenceArr = this.f2419h;
        if (charSequenceArr != null) {
            for (java.lang.CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        android.widget.ArrayAdapter arrayAdapter = this.f2418j;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}

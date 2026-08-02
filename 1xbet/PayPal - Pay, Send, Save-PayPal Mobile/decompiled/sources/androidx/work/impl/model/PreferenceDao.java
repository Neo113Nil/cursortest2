package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/PreferenceDao;", "", "Landroidx/work/impl/model/Preference;", "preference", "", "insertPreference", "(Landroidx/work/impl/model/Preference;)V", "", "key", "", "getLongValue", "(Ljava/lang/String;)Ljava/lang/Long;", "Landroidx/lifecycle/LiveData;", "getObservableLongValue", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PreferenceDao {
    java.lang.Long getLongValue(java.lang.String key);

    androidx.view.LiveData<java.lang.Long> getObservableLongValue(java.lang.String key);

    void insertPreference(androidx.work.impl.model.Preference preference);
}

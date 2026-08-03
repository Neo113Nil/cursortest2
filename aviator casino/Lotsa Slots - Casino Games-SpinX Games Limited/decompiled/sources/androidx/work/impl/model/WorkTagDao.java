package androidx.work.impl.model;

/* compiled from: WorkTagDao.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "deleteByWorkSpecId", "", "id", "", "getTagsForWorkSpecId", "", "getWorkSpecIdsWithTag", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "insert", "workTag", "Landroidx/work/impl/model/WorkTag;", "insertTags", "tags", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface WorkTagDao {
    void deleteByWorkSpecId(java.lang.String id);

    java.util.List<java.lang.String> getTagsForWorkSpecId(java.lang.String id);

    java.util.List<java.lang.String> getWorkSpecIdsWithTag(java.lang.String tag);

    void insert(androidx.work.impl.model.WorkTag workTag);

    void insertTags(java.lang.String id, java.util.Set<java.lang.String> tags);

    /* compiled from: WorkTagDao.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void insertTags(androidx.work.impl.model.WorkTagDao workTagDao, java.lang.String id, java.util.Set<java.lang.String> tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
            java.util.Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new androidx.work.impl.model.WorkTag((java.lang.String) it.next(), id));
            }
        }
    }
}

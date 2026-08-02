package com.discover.mpos.sdk.data.external.readdatarecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0017\b\u0010\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "<init>", "()V", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "content", "(Ljava/util/List;)V", "", "tag", "", "contentForTag", "(Ljava/lang/String;)[B", "export$mpos_sdk_card_reader_offlineRegularRelease", "()Ljava/util/List;", "get", "(Ljava/lang/String;)Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "toByteArray", "()[B", "", "updateValueForTag", "(Ljava/lang/String;[B)V", "updatedTags$mpos_sdk_card_reader_offlineRegularRelease", "pdolData", "Ljava/util/List;", "", "updatedTags"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class PdolUpdate implements com.discover.mpos.sdk.core.emv.EmvData {
    private java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> pdolData;
    private final java.util.List<java.lang.String> updatedTags;

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    public PdolUpdate() {
        this.pdolData = kotlin.collections.CollectionsKt.emptyList();
        this.updatedTags = new java.util.ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdolUpdate(java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.pdolData = list;
    }

    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> export$mpos_sdk_card_reader_offlineRegularRelease() {
        return this.pdolData;
    }

    public final java.util.List<java.lang.String> updatedTags$mpos_sdk_card_reader_offlineRegularRelease() {
        return this.updatedTags;
    }

    public final void updateValueForTag(java.lang.String tag, byte[] content) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        byte[] content2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, com.discover.mpos.sdk.core.emv.tlv.Tag.UNPREDICTABLE_NUMBER.getTag()) || (tlv = get(tag)) == null || (content2 = tlv.getContent()) == null || content2.length != content.length) {
            return;
        }
        tlv.setContent(content);
        this.updatedTags.add(tag);
    }

    public final byte[] contentForTag(java.lang.String tag) {
        byte[] content;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = get(tag);
        if (tlv == null || (content = tlv.getContent()) == null) {
            return null;
        }
        return java.util.Arrays.copyOf(content, content.length);
    }

    private final com.discover.mpos.sdk.core.emv.tlv.Tlv get(java.lang.String tag) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.pdolData.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), tag)) {
                break;
            }
        }
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
        java.util.Iterator<T> it = this.pdolData.iterator();
        while (it.hasNext()) {
            byteArrayBuilder.append(((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).getContent());
        }
        return byteArrayBuilder.build();
    }
}

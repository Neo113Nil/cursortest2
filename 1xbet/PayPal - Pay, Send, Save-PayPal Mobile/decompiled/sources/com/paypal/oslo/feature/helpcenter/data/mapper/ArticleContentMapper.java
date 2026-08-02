package com.paypal.oslo.feature.helpcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/mapper/ArticleContentMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "toArticle", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;)Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "mobileContent", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/MobileContent;", "parseMobileContent", "(Ljava/lang/Object;)Ljava/util/List;", "", "", "p0", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;", "Camera2StreamConfigurationMap", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticleContentMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.helpcenter.data.mapper.ArticleContentMapper INSTANCE = new com.paypal.oslo.feature.helpcenter.data.mapper.ArticleContentMapper();

    private ArticleContentMapper() {
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.Article toArticle(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle) {
        com.paypal.oslo.feature.helpcenter.data.mapper.ArticleContentMapper articleContentMapper;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpArticle, "");
        java.lang.String id = helpArticle.getId();
        java.lang.String title = helpArticle.getTitle();
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson = helpArticle.getContentJson();
        if (contentJson != null) {
            obj = contentJson.getPersonal();
            articleContentMapper = this;
        } else {
            articleContentMapper = this;
            obj = null;
        }
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.MobileContent> parseMobileContent = articleContentMapper.parseMobileContent(obj);
        com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory = helpArticle.getContentCategory();
        java.lang.String name2 = contentCategory != null ? contentCategory.name() : null;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> relatedArticles = helpArticle.getRelatedArticles();
        if (relatedArticles != null) {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> list = relatedArticles;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle relatedArticle : list) {
                java.lang.String id2 = relatedArticle.getId();
                java.lang.String title2 = relatedArticle.getTitle();
                com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory2 = relatedArticle.getContentCategory();
                arrayList2.add(new com.paypal.oslo.feature.helpcenter.domain.models.Article(id2, title2, null, null, contentCategory2 != null ? contentCategory2.name() : null, null, null, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.helpcenter.domain.models.Article(id, title, null, parseMobileContent, name2, null, arrayList, null);
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.MobileContent> parseMobileContent(java.lang.Object mobileContent) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.helpcenter.domain.models.MobileContent mobileContent2;
        java.util.List list = mobileContent instanceof java.util.List ? (java.util.List) mobileContent : null;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map == null) {
                mobileContent2 = null;
            } else {
                java.lang.Object obj2 = map.get("node");
                java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                java.lang.Object obj3 = map.get("child");
                java.util.List list2 = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
                if (list2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : list2) {
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
                        com.paypal.oslo.feature.helpcenter.domain.models.EcmChild Camera2StreamConfigurationMap = map2 == null ? null : INSTANCE.Camera2StreamConfigurationMap(map2);
                        if (Camera2StreamConfigurationMap != null) {
                            arrayList3.add(Camera2StreamConfigurationMap);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                mobileContent2 = new com.paypal.oslo.feature.helpcenter.domain.models.MobileContent(null, null, null, null, str, arrayList);
            }
            if (mobileContent2 != null) {
                arrayList2.add(mobileContent2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.paypal.oslo.feature.helpcenter.domain.models.EcmChild Camera2StreamConfigurationMap(java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute anchorAttribute;
        java.lang.String str;
        java.lang.Object obj = p0.get("node");
        java.util.ArrayList arrayList = null;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = p0.get("tag");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = p0.get("text");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = p0.get("attr");
        java.util.Map map = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
        java.lang.Object obj5 = p0.get("child");
        java.util.List list = obj5 instanceof java.util.List ? (java.util.List) obj5 : null;
        if (map != null && str3 != null) {
            int hashCode = str3.hashCode();
            if (hashCode != -1191214428) {
                if (hashCode != 97) {
                    if (hashCode == 104387 && str3.equals("img")) {
                        java.lang.Object obj6 = map.get("src");
                        java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                        java.lang.Object obj7 = map.get("width");
                        java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                        java.lang.Object obj8 = map.get("height");
                        java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                        java.lang.Object obj9 = map.get("alt");
                        if (obj9 instanceof java.lang.String) {
                            str = (java.lang.String) obj9;
                        } else {
                            boolean z = obj9 instanceof java.util.List;
                            if (z) {
                                java.util.List list2 = z ? (java.util.List) obj9 : null;
                                if (list2 != null) {
                                    str = kotlin.collections.CollectionsKt.joinToString$default(list2, " ", null, null, 0, null, null, 62, null);
                                }
                            }
                            str = null;
                        }
                        anchorAttribute = new com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute(str5, str6, str7, str);
                    }
                } else if (str3.equals("a")) {
                    java.lang.Object obj10 = map.get("href");
                    java.lang.String str8 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    java.lang.Object obj11 = map.get(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
                    java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                    java.lang.Object obj12 = map.get("source");
                    anchorAttribute = new com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute(str8, str9, obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null);
                }
            } else if (str3.equals("iframe")) {
                java.lang.Object obj13 = map.get("src");
                anchorAttribute = new com.paypal.oslo.feature.helpcenter.domain.models.IframeAttribute(obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null);
            }
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj14 : list) {
                    java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = obj14 instanceof java.util.Map ? (java.util.Map) obj14 : null;
                    com.paypal.oslo.feature.helpcenter.domain.models.EcmChild Camera2StreamConfigurationMap = map2 == null ? null : INSTANCE.Camera2StreamConfigurationMap(map2);
                    if (Camera2StreamConfigurationMap != null) {
                        arrayList2.add(Camera2StreamConfigurationMap);
                    }
                }
                arrayList = arrayList2;
            }
            return new com.paypal.oslo.feature.helpcenter.domain.models.EcmChild(str2, str3, anchorAttribute, arrayList, str4);
        }
        anchorAttribute = null;
        if (list != null) {
        }
        return new com.paypal.oslo.feature.helpcenter.domain.models.EcmChild(str2, str3, anchorAttribute, arrayList, str4);
    }
}

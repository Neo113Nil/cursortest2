package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ2\u0010#\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0086@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b%\u0010&JA\u0010.\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*\u0012\u0006\u0012\u0004\u0018\u00010+0)¢\u0006\u0002\b,H\u0096@¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\rJ)\u00106\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001c2\b\b\u0002\u00105\u001a\u00020\u001cH\u0000¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u000202H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010:J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010;J\u000f\u0010<\u001a\u00020\u001cH\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020>H\u0002¢\u0006\u0004\b\u000e\u0010BJ\u001f\u0010@\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010CJ\u0015\u0010D\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\bD\u0010EJ!\u0010H\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bH\u0010IR$\u0010J\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u001c8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010=R(\u0010M\u001a\u0004\u0018\u0001022\b\u0010\u000b\u001a\u0004\u0018\u0001028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u000fR+\u0010[\u001a\u00020S2\u0006\u0010T\u001a\u00020S8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010@\u001a\u00020\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010_\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u000fR$\u0010b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bc\u0010\u000fR\"\u0010e\u001a\u00020d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010X\"\u0004\bh\u0010ZR\"\u0010i\u001a\u00020d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bi\u0010f\u001a\u0004\bj\u0010X\"\u0004\bk\u0010ZR\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010lR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010%\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u000fR$\u0010r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\br\u0010`\u001a\u0004\bs\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010`R\"\u0010u\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bu\u0010K\u001a\u0004\bv\u0010=\"\u0004\bw\u0010xR\u0016\u0010t\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010`R\u0018\u0010{\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010zR\u0016\u0010m\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010KR\u001c\u0010~\u001a\b\u0012\u0004\u0012\u0002020}8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010VR\u0013\u0010\u0081\u0001\u001a\u00020>8G¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000fR\u0016\u0010\u0085\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u000fR*\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008e\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u000fR'\u0010\u008f\u0001\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010`\u001a\u0005\b\u0090\u0001\u0010\u000f\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00048AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0015\u0010\u009e\u0001\u001a\u00030\u009b\u00018G¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0012\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u000fR/\u0010¢\u0001\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0015\n\u0006\b \u0001\u0010¡\u0001\u001a\u0004\b8\u0010\u000f\"\u0005\b8\u0010\u0092\u0001R.\u0010]\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0015\n\u0006\b£\u0001\u0010¡\u0001\u001a\u0004\b\f\u0010\u000f\"\u0005\b@\u0010\u0092\u0001R\u001f\u0010§\u0001\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u000f\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010\u000fR\u001e\u0010\u0018\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u000f\n\u0006\b¨\u0001\u0010¥\u0001\u001a\u0005\b©\u0001\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00048G¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0094\u0001R \u0010¬\u0001\u001a\u00030«\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010|\u001a\u00030°\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010±\u0001R\u0017\u0010£\u0001\u001a\u00030²\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b%\u0010³\u0001R \u0010µ\u0001\u001a\u00030´\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R \u0010º\u0001\u001a\u00030¹\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010¿\u0001\u001a\u00030¾\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R7\u0010É\u0001\u001a\u0005\u0018\u00010Ã\u00012\t\u0010T\u001a\u0005\u0018\u00010Ã\u00018A@CX\u0081\u008e\u0002¢\u0006\u0017\n\u0005\bÄ\u0001\u0010V\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R \u0010Ë\u0001\u001a\u00030Ê\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R'\u0010Ð\u0001\u001a\u00030Ï\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bÐ\u0001\u0010f\u001a\u0005\bÑ\u0001\u0010X\"\u0005\bÒ\u0001\u0010ZR \u0010Ô\u0001\u001a\u00030Ó\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Û\u0001\u001a\u00030Ø\u00018AX\u0080\u0084\u0002¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010Ý\u0001\u001a\u00030Ü\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\bÝ\u0001\u0010V\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001f\u0010à\u0001\u001a\u00030Ü\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\bà\u0001\u0010V\u001a\u0006\bá\u0001\u0010ß\u0001R\u0016\u0010â\u0001\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010=R/\u0010æ\u0001\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u001c8G@CX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\bã\u0001\u0010V\u001a\u0005\bä\u0001\u0010=\"\u0005\bå\u0001\u0010xR/\u0010ê\u0001\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u001c8G@CX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\bç\u0001\u0010V\u001a\u0005\bè\u0001\u0010=\"\u0005\bé\u0001\u0010xR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001c0}8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010VR\u001b\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0}8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010VR\u0016\u0010ì\u0001\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bë\u0001\u0010=R\u0016\u0010î\u0001\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bí\u0001\u0010=R\u001a\u0010ò\u0001\u001a\u0005\u0018\u00010ï\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "(IF)V", "p0", "getHighSpeedVideoFpsRanges", "(F)F", "Camera2StreamConfigurationMap", "()I", "page", "pageOffsetFraction", "", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollScope;", "updateCurrentPage", "(Landroidx/compose/foundation/gestures/ScrollScope;IF)V", "targetPage", "updateTargetPage", "(Landroidx/compose/foundation/gestures/ScrollScope;I)V", "offsetFraction", "", "forceRemeasure", "snapToItem$foundation", "(IFZ)V", "requestScrollToPage", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation", "(Landroidx/compose/foundation/pager/PagerMeasureResult;ZZ)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "(I)I", "(F)Z", "isNotGestureAction$foundation", "()Z", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "p1", "getHighSpeedVideoFpsRangesFor", "(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "(ZLandroidx/compose/foundation/pager/PagerLayoutInfo;)I", "getOffsetDistanceInPages", "(I)F", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchScrollPositionWithKey$foundation", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "hasLookaheadOccurred", "Z", "getHasLookaheadOccurred$foundation", "approachLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getApproachLayoutInfo$foundation", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "getPageCount", "pageCount", "Landroidx/compose/ui/geometry/Offset;", "<set-?>", "upDownDifference$delegate", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation", "()J", "setUpDownDifference-k-4lQ0M$foundation", "(J)V", "upDownDifference", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "firstVisiblePage", com.visa.cbp.getEncExpo.warmup, "getFirstVisiblePage$foundation", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation", "", "maxScrollOffset", "J", "getMaxScrollOffset$foundation", "setMaxScrollOffset$foundation", "minScrollOffset", "getMinScrollOffset$foundation", "setMinScrollOffset$foundation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizesFor", "getOutputStallDurationlomOqCM", "Landroidx/compose/foundation/gestures/ScrollableState;", "getNumMeasurePasses$foundation", "numMeasurePasses", "layoutWithMeasurement", "getLayoutWithMeasurement$foundation", "getInputFormats", "prefetchingEnabled", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "getOutputMinFrameDuration", "getOutputSizes", "Landroidx/compose/runtime/MutableState;", "getOutputFormats", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation", "pageSpacing", "getPageSize$foundation", "pageSize", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation", "(Landroidx/compose/ui/unit/Density;)V", "getPageSizeWithSpacing$foundation", "pageSizeWithSpacing", "latestPageSizeWithSpacing", "getLatestPageSizeWithSpacing$foundation", "setLatestPageSizeWithSpacing$foundation", "(I)V", "getPositionThresholdFraction$foundation", "()F", "positionThresholdFraction", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "getOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableIntState;", "getInputSizeshNQ4ISI", "getOutputStallDuration", "settledPage$delegate", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "targetPage$delegate", "getTargetPage", "getCurrentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/pager/PagerState$pagerCacheWindow$1;", "Landroidx/compose/foundation/pager/PagerState$pagerCacheWindow$1;", "Landroidx/compose/foundation/pager/PagerState$_scrollIndicatorState$1;", "Landroidx/compose/foundation/pager/PagerState$_scrollIndicatorState$1;", "Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "cacheWindowLogic", "Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "getCacheWindowLogic$foundation", "()Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement$foundation", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints", "getPremeasureConstraints-msEJaDk$foundation", "setPremeasureConstraints-BRTryo0$foundation", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation", "()Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation", "()Landroidx/compose/runtime/MutableState;", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation", "isScrollInProgress", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "scrollIndicatorState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagerState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.foundation.pager.PagerMeasureResult approachLayoutInfo;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final androidx.compose.foundation.pager.PagerCacheWindowLogic cacheWindowLogic;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;
    private androidx.compose.ui.unit.Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1 getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1 getOutputSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableState<androidx.compose.foundation.pager.PagerMeasureResult> getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerScrollPosition getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableState getHighSpeedVideoSizes;
    private boolean hasLookaheadOccurred;
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource;
    private int latestPageSizeWithSpacing;
    private int layoutWithMeasurement;
    private long maxScrollOffset;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> measurementScopeInvalidator;
    private long minScrollOffset;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedPages;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State settledPage;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State targetPage;

    /* renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState upDownDifference;

    public abstract int getPageCount();

    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1] */
    public PagerState(int i, float f, androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler) {
        androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1;
        double d = f;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (-0.5d > d || d > 0.5d) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("currentPageOffsetFraction ");
            sb.append(f);
            sb.append(" is not within the range -0.5 to 0.5");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        this.upDownDifference = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()), null, 2, null);
        androidx.compose.foundation.pager.PagerScrollPosition pagerScrollPosition = new androidx.compose.foundation.pager.PagerScrollPosition(i, f, this);
        this.getHighSpeedVideoFpsRangesFor = pagerScrollPosition;
        this.firstVisiblePage = i;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.getHighSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                float highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerState.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState.this, ((java.lang.Float) obj).floatValue());
                return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor);
            }
        });
        this.prefetchingEnabled = true;
        this.getInputFormats = -1;
        this.getOutputFormats = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.foundation.pager.PagerStateKt.getEmptyLayoutInfo(), androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        pagerStateKt$UnitDensity$1 = androidx.compose.foundation.pager.PagerStateKt.getHighSpeedVideoSizes;
        this.density = pagerStateKt$UnitDensity$1;
        this.internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        this.getInputSizeshNQ4ISI = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(-1);
        this.getOutputMinFrameDurationlomOqCM = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
        this.settledPage = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.pager.PagerState.getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState.this);
                return java.lang.Integer.valueOf(highSpeedVideoSizes);
            }
        });
        this.targetPage = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerState.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState.this);
                return java.lang.Integer.valueOf(highSpeedVideoFpsRangesFor);
            }
        });
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState(prefetchScheduler, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.pager.PagerState.Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState.this, (androidx.compose.foundation.lazy.layout.NestedPrefetchScope) obj);
                return Camera2StreamConfigurationMap;
            }
        });
        this.prefetchState = lazyLayoutPrefetchState;
        ?? r13 = new androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow() { // from class: androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public final int calculateBehindWindow(androidx.compose.ui.unit.Density density, int i2) {
                return 0;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public final int calculateAheadWindow(androidx.compose.ui.unit.Density density, int i2) {
                return androidx.compose.foundation.pager.PagerState.this.getLatestPageSizeWithSpacing();
            }
        };
        this.getOutputSizes = r13;
        this.getOutputStallDuration = new androidx.compose.foundation.ScrollIndicatorState() { // from class: androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getScrollOffset() {
                int Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.pager.PagerState.this.Camera2StreamConfigurationMap();
                return Camera2StreamConfigurationMap;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getContentSize() {
                return androidx.compose.foundation.pager.PagerLayoutInfoKt.calculateContentSize(androidx.compose.foundation.pager.PagerState.this.getLayoutInfo(), androidx.compose.foundation.pager.PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getViewportSize() {
                return androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(androidx.compose.foundation.pager.PagerState.this.getLayoutInfo());
            }
        };
        this.cacheWindowLogic = new androidx.compose.foundation.pager.PagerCacheWindowLogic((androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow) r13, lazyLayoutPrefetchState, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this);
                return java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        });
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
        this.remeasurement = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void onRemeasurementAvailable(androidx.compose.ui.layout.Remeasurement remeasurement) {
                androidx.compose.foundation.pager.PagerState.this.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getOutputStallDurationlomOqCM = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i, float f, androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public PagerState(int i, float f) {
        this(i, f, null);
    }

    /* renamed from: getHasLookaheadOccurred$foundation, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: getApproachLayoutInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.pager.PagerMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation, reason: not valid java name */
    public final long m1935getUpDownDifferenceF1C5BW0$foundation() {
        return ((androidx.compose.ui.geometry.Offset) this.upDownDifference.getValue()).m5762unboximpl();
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation, reason: not valid java name */
    public final void m1937setUpDownDifferencek4lQ0M$foundation(long j) {
        this.upDownDifference.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* renamed from: getFirstVisiblePage$foundation, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: getFirstVisiblePageOffset$foundation, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* renamed from: getMaxScrollOffset$foundation, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    public final void setMaxScrollOffset$foundation(long j) {
        this.maxScrollOffset = j;
    }

    /* renamed from: getMinScrollOffset$foundation, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final void setMinScrollOffset$foundation(long j) {
        this.minScrollOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState pagerState, float f) {
        return pagerState.getHighSpeedVideoFpsRanges(f);
    }

    private final float getHighSpeedVideoFpsRanges(float p0) {
        androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult;
        long currentAbsoluteScrollOffset = androidx.compose.foundation.pager.PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f = this.getHighResolutionOutputSizeshNQ4ISI + p0;
        long roundToLong = kotlin.math.MathKt.roundToLong(f);
        this.getHighResolutionOutputSizeshNQ4ISI = f - roundToLong;
        if (java.lang.Math.abs(p0) < 1.0E-4f) {
            return p0;
        }
        long j = roundToLong + currentAbsoluteScrollOffset;
        long coerceIn = kotlin.ranges.RangesKt.coerceIn(j, this.minScrollOffset, this.maxScrollOffset);
        boolean z = j != coerceIn;
        long j2 = coerceIn - currentAbsoluteScrollOffset;
        float f2 = j2;
        this.getHighSpeedVideoFpsRanges = f2;
        if (java.lang.Math.abs(j2) != 0) {
            this.getOutputStallDurationlomOqCM.setValue(java.lang.Boolean.valueOf(f2 > 0.0f));
            this.getOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(f2 < 0.0f));
        }
        int i = (int) j2;
        int i2 = -i;
        androidx.compose.foundation.pager.PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = this.getOutputFormats.getValue().copyWithScrollDeltaWithoutRemeasure(i2);
        if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            androidx.compose.foundation.pager.PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i2) : null;
            if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
            } else {
                copyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (copyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1876invalidateScopeimpl(this.placementScopeInvalidator);
            this.Camera2StreamConfigurationMap++;
        } else {
            this.getHighSpeedVideoFpsRangesFor.applyScrollDelta(i);
            androidx.compose.ui.layout.Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z ? java.lang.Long.valueOf(j2) : java.lang.Float.valueOf(p0)).floatValue();
    }

    public final int getNumMeasurePasses$foundation() {
        return this.layoutWithMeasurement + this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getLayoutWithMeasurement$foundation, reason: from getter */
    public final int getLayoutWithMeasurement() {
        return this.layoutWithMeasurement;
    }

    /* renamed from: getPrefetchingEnabled$foundation, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final androidx.compose.foundation.pager.PagerLayoutInfo getLayoutInfo() {
        return this.getOutputFormats.getValue();
    }

    public final int getPageSpacing$foundation() {
        return this.getOutputFormats.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation() {
        return this.getOutputFormats.getValue().getPageSize();
    }

    /* renamed from: getDensity$foundation, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation(androidx.compose.ui.unit.Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation() {
        return getPageSize$foundation() + getPageSpacing$foundation();
    }

    /* renamed from: getLatestPageSizeWithSpacing$foundation, reason: from getter */
    public final int getLatestPageSizeWithSpacing() {
        return this.latestPageSizeWithSpacing;
    }

    public final void setLatestPageSizeWithSpacing$foundation(int i) {
        this.latestPageSizeWithSpacing = i;
    }

    public final float getPositionThresholdFraction$foundation() {
        return java.lang.Math.min(this.density.mo1418toPx0680j_4(androidx.compose.foundation.pager.PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation() / 2.0f) / getPageSize$foundation();
    }

    /* renamed from: getInternalInteractionSource$foundation, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentPage();
    }

    private final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI.getIntValue();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.getInputSizeshNQ4ISI.setIntValue(i);
    }

    private final int getHighSpeedVideoFpsRanges() {
        return this.getOutputMinFrameDurationlomOqCM.getIntValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(int i) {
        this.getOutputMinFrameDurationlomOqCM.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((java.lang.Number) this.settledPage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState pagerState) {
        if (pagerState.isScrollInProgress()) {
            return pagerState.getHighSpeedVideoFpsRanges();
        }
        return pagerState.getCurrentPage();
    }

    public final int getTargetPage() {
        return ((java.lang.Number) this.targetPage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState pagerState) {
        int currentPage;
        if (pagerState.isScrollInProgress()) {
            if (pagerState.getHighResolutionOutputSizeshNQ4ISI() != -1) {
                currentPage = pagerState.getHighResolutionOutputSizeshNQ4ISI();
            } else if (java.lang.Math.abs(pagerState.getCurrentPageOffsetFraction()) >= java.lang.Math.abs(pagerState.getPositionThresholdFraction$foundation())) {
                if (pagerState.getLastScrolledForward()) {
                    currentPage = pagerState.firstVisiblePage + 1;
                } else {
                    currentPage = pagerState.firstVisiblePage;
                }
            }
            return pagerState.Camera2StreamConfigurationMap(currentPage);
        }
        currentPage = pagerState.getCurrentPage();
        return pagerState.Camera2StreamConfigurationMap(currentPage);
    }

    public final float getCurrentPageOffsetFraction() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentPageOffsetFraction();
    }

    /* renamed from: getPrefetchState$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope) {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            nestedPrefetchScope.schedulePrecomposition(pagerState.firstVisiblePage);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Camera2StreamConfigurationMap() {
        long pageSizeWithSpacing$foundation = (getPageSizeWithSpacing$foundation() * this.firstVisiblePage) + this.firstVisiblePageOffset;
        if (pageSizeWithSpacing$foundation > androidx.collection.SieveCacheKt.NodeLinkMask) {
            pageSizeWithSpacing$foundation = 2147483647L;
        }
        return (int) pageSizeWithSpacing$foundation;
    }

    /* renamed from: getCacheWindowLogic$foundation, reason: from getter */
    public final androidx.compose.foundation.pager.PagerCacheWindowLogic getCacheWindowLogic() {
        return this.cacheWindowLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState) {
        return pagerState.getPageCount();
    }

    /* renamed from: getBeyondBoundsInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getAwaitLayoutModifier$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(androidx.compose.ui.layout.Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final androidx.compose.ui.layout.Remeasurement getRemeasurement$foundation() {
        return (androidx.compose.ui.layout.Remeasurement) this.remeasurement.getValue();
    }

    /* renamed from: getRemeasurementModifier$foundation, reason: from getter */
    public final androidx.compose.ui.layout.RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation, reason: not valid java name */
    public final void m1936setPremeasureConstraintsBRTryo0$foundation(long j) {
        this.premeasureConstraints = j;
    }

    /* renamed from: getPinnedPages$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation() {
        return this.getHighSpeedVideoFpsRangesFor.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1933getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ java.lang.Object scrollToPage$default(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    public final java.lang.Object scrollToPage(int i, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(this, null, new androidx.compose.foundation.pager.PagerState$scrollToPage$2(this, f, i, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, float f, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    public final void updateCurrentPage(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, float f) {
        snapToItem$foundation(i, f, true);
    }

    public final void updateTargetPage(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i) {
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(i));
    }

    public final void snapToItem$foundation(int page, float offsetFraction, boolean forceRemeasure) {
        if (this.getHighSpeedVideoFpsRangesFor.getCurrentPage() != page || this.getHighSpeedVideoFpsRangesFor.getCurrentPageOffsetFraction() != offsetFraction) {
            this.cacheWindowLogic.resetStrategy();
        }
        this.getHighSpeedVideoFpsRangesFor.requestPositionAndForgetLastKnownKey(page, offsetFraction);
        if (forceRemeasure) {
            androidx.compose.ui.layout.Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
                return;
            }
            return;
        }
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1876invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1932getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToPage$default(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.requestScrollToPage(i, f);
    }

    public final void requestScrollToPage(int page, float pageOffsetFraction) {
        if (isScrollInProgress()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getOutputFormats.getValue().getCoroutineScope(), null, null, new androidx.compose.foundation.pager.PagerState$requestScrollToPage$1(this, null), 3, null);
        }
        snapToItem$foundation(page, pageOffsetFraction, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(r11, null, r3, r4, 1, null) != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (getHighSpeedVideoSizes(r4) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object animateScrollToPage(int i, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        double d;
        if (continuation instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) continuation;
            if ((pagerState$animateScrollToPage$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$12 = pagerState$animateScrollToPage$1;
                java.lang.Object obj = pagerState$animateScrollToPage$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pagerState$animateScrollToPage$12.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if ((i == getCurrentPage() && getCurrentPageOffsetFraction() == f) || getPageCount() == 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    pagerState$animateScrollToPage$12.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
                    pagerState$animateScrollToPage$12.getHighSpeedVideoSizes = i;
                    pagerState$animateScrollToPage$12.getHighSpeedVideoFpsRangesFor = f;
                    pagerState$animateScrollToPage$12.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    f = pagerState$animateScrollToPage$12.getHighSpeedVideoFpsRangesFor;
                    i = pagerState$animateScrollToPage$12.getHighSpeedVideoSizes;
                    animationSpec = (androidx.compose.animation.core.AnimationSpec) pagerState$animateScrollToPage$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2 = animationSpec;
                d = f;
                if (-0.5d <= d || d > 0.5d) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("pageOffsetFraction ");
                    sb.append(f);
                    sb.append(" is not within the range -0.5 to 0.5");
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
                }
                androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3(this, Camera2StreamConfigurationMap(i), f * getPageSizeWithSpacing$foundation(), animationSpec2, null);
                pagerState$animateScrollToPage$12.getHighResolutionOutputSizeshNQ4ISI = null;
                pagerState$animateScrollToPage$12.Camera2StreamConfigurationMap = 2;
            }
        }
        pagerState$animateScrollToPage$1 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1(this, continuation);
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$122 = pagerState$animateScrollToPage$1;
        java.lang.Object obj2 = pagerState$animateScrollToPage$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pagerState$animateScrollToPage$122.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec22 = animationSpec;
        d = f;
        if (-0.5d <= d) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("pageOffsetFraction ");
        sb2.append(f);
        sb2.append(" is not within the range -0.5 to 0.5");
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$32 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3(this, Camera2StreamConfigurationMap(i), f * getPageSizeWithSpacing$foundation(), animationSpec22, null);
        pagerState$animateScrollToPage$122.getHighResolutionOutputSizeshNQ4ISI = null;
        pagerState$animateScrollToPage$122.Camera2StreamConfigurationMap = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateScrollToPage$default(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getOutputFormats.getValue() == androidx.compose.foundation.pager.PagerStateKt.getEmptyLayoutInfo()) {
            java.lang.Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
            return waitForFirstLayout == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitForFirstLayout : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r8.scroll(r6, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r5.getHighSpeedVideoSizes(r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.pager.PagerState$scroll$1 pagerState$scroll$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.pager.PagerState$scroll$1) {
            pagerState$scroll$1 = (androidx.compose.foundation.pager.PagerState$scroll$1) continuation;
            if ((pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pagerState$scroll$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    pagerState$scroll$1.Camera2StreamConfigurationMap = pagerState;
                    pagerState$scroll$1.getHighSpeedVideoFpsRangesFor = mutatePriority;
                    pagerState$scroll$1.getHighSpeedVideoSizes = function2;
                    pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pagerState = (androidx.compose.foundation.pager.PagerState) pagerState$scroll$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pagerState.getHighResolutionOutputSizeshNQ4ISI(-1);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) pagerState$scroll$1.getHighSpeedVideoSizes;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) pagerState$scroll$1.getHighSpeedVideoFpsRangesFor;
                    pagerState = (androidx.compose.foundation.pager.PagerState) pagerState$scroll$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!pagerState.isScrollInProgress()) {
                    pagerState.getHighSpeedVideoFpsRangesFor(pagerState.getCurrentPage());
                }
                androidx.compose.foundation.gestures.ScrollableState scrollableState = pagerState.getHighSpeedVideoSizes;
                pagerState$scroll$1.Camera2StreamConfigurationMap = pagerState;
                pagerState$scroll$1.getHighSpeedVideoFpsRangesFor = null;
                pagerState$scroll$1.getHighSpeedVideoSizes = null;
                pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        pagerState$scroll$1 = new androidx.compose.foundation.pager.PagerState$scroll$1(pagerState, continuation);
        java.lang.Object obj2 = pagerState$scroll$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (!pagerState.isScrollInProgress()) {
        }
        androidx.compose.foundation.gestures.ScrollableState scrollableState2 = pagerState.getHighSpeedVideoSizes;
        pagerState$scroll$1.Camera2StreamConfigurationMap = pagerState;
        pagerState$scroll$1.getHighSpeedVideoFpsRangesFor = null;
        pagerState$scroll$1.getHighSpeedVideoSizes = null;
        pagerState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.getHighSpeedVideoSizes.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.getHighSpeedVideoSizes.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.getOutputStallDurationlomOqCM.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.getOutputSizeshNQ4ISI.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return this.getOutputStallDuration;
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        pagerState.applyMeasureResult$foundation(pagerMeasureResult, z, z2);
    }

    public final void applyMeasureResult$foundation(androidx.compose.foundation.pager.PagerMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        long highSpeedVideoFpsRanges;
        this.prefetchState.setIdealNestedPrefetchCount$foundation(result.getVisiblePagesInfo().size());
        this.latestPageSizeWithSpacing = result.getPageSize() + result.getPageSpacing();
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.getHighSpeedVideoFpsRangesFor.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
        } else {
            this.getHighSpeedVideoFpsRangesFor.updateFromMeasureResult(result);
            if (androidx.compose.foundation.ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                if (this.prefetchingEnabled) {
                    this.cacheWindowLogic.onVisibleItemsChanged(result);
                }
            } else {
                Camera2StreamConfigurationMap(result);
            }
        }
        this.getOutputFormats.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        androidx.compose.foundation.pager.MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        getHighResolutionOutputSizeshNQ4ISI(result);
        this.maxScrollOffset = androidx.compose.foundation.pager.PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
        highSpeedVideoFpsRanges = androidx.compose.foundation.pager.PagerStateKt.getHighSpeedVideoFpsRanges(result, getPageCount());
        this.minScrollOffset = kotlin.ranges.RangesKt.coerceAtMost(highSpeedVideoFpsRanges, this.maxScrollOffset);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerMeasureResult p0) {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (this.prefetchingEnabled) {
                if (p0.getBeyondViewportPageCount() >= getPageCount()) {
                    return;
                }
                if (java.lang.Math.abs(this.getHighSpeedVideoFpsRanges) <= 0.5f) {
                    return;
                }
                if (getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges)) {
                    if (androidx.compose.foundation.ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                        this.cacheWindowLogic.onScroll(this.getHighSpeedVideoFpsRanges, p0);
                    } else {
                        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, p0);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Camera2StreamConfigurationMap(int i) {
        if (getPageCount() > 0) {
            return kotlin.ranges.RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean getHighSpeedVideoSizes(float p0) {
        if (getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            if (java.lang.Math.signum(p0) == java.lang.Math.signum(-java.lang.Float.intBitsToFloat((int) (m1935getUpDownDifferenceF1C5BW0$foundation() & 4294967295L)))) {
                return true;
            }
        } else if (java.lang.Math.signum(p0) == java.lang.Math.signum(-java.lang.Float.intBitsToFloat((int) (m1935getUpDownDifferenceF1C5BW0$foundation() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation();
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) java.lang.Float.intBitsToFloat((int) (m1935getUpDownDifferenceF1C5BW0$foundation() >> 32))) == 0 && ((int) java.lang.Float.intBitsToFloat((int) (m1935getUpDownDifferenceF1C5BW0$foundation() & 4294967295L))) == 0;
    }

    private final void getHighSpeedVideoFpsRangesFor(float p0, androidx.compose.foundation.pager.PagerLayoutInfo p1) {
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!this.prefetchingEnabled || p1.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        boolean z = p0 > 0.0f;
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(z, p1);
        if (highSpeedVideoFpsRangesFor < 0 || highSpeedVideoFpsRangesFor >= getPageCount()) {
            return;
        }
        if (highSpeedVideoFpsRangesFor != this.getInputFormats) {
            if (this.getHighSpeedVideoSizesFor != z && (prefetchHandle3 = this.getOutputMinFrameDuration) != null) {
                prefetchHandle3.cancel();
            }
            this.getHighSpeedVideoSizesFor = z;
            this.getInputFormats = highSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.m1861schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, highSpeedVideoFpsRangesFor, this.premeasureConstraints, null, 4, null);
        }
        if (z) {
            if ((((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) p1.getVisiblePagesInfo())).getOffset() + (p1.getPageSize() + p1.getPageSpacing())) - p1.getViewportEndOffset() >= p0 || (prefetchHandle2 = this.getOutputMinFrameDuration) == null) {
                return;
            }
            prefetchHandle2.markAsUrgent();
            return;
        }
        if (p1.getViewportStartOffset() - ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.first((java.util.List) p1.getVisiblePagesInfo())).getOffset() >= (-p0) || (prefetchHandle = this.getOutputMinFrameDuration) == null) {
            return;
        }
        prefetchHandle.markAsUrgent();
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerLayoutInfo p0) {
        if (this.getInputFormats == -1 || p0.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.getInputFormats != getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, p0)) {
            this.getInputFormats = -1;
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.getOutputMinFrameDuration;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.getOutputMinFrameDuration = null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(boolean p0, androidx.compose.foundation.pager.PagerLayoutInfo p1) {
        if (p0) {
            int beyondViewportPageCount = p1.getBeyondViewportPageCount() + 1;
            if (beyondViewportPageCount < 0) {
                return Integer.MAX_VALUE;
            }
            return ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) p1.getVisiblePagesInfo())).getIndex() + beyondViewportPageCount;
        }
        return (((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.first((java.util.List) p1.getVisiblePagesInfo())).getIndex() - p1.getBeyondViewportPageCount()) - 1;
    }

    public final float getOffsetDistanceInPages(int page) {
        if (page < 0 || page > getPageCount()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("page ");
            sb.append(page);
            sb.append(" is not within the range 0 to ");
            sb.append(getPageCount());
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return (page - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.getHighSpeedVideoFpsRangesFor.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (java.lang.Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, i);
    }

    public final int matchScrollPositionWithKey$foundation(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.getHighSpeedVideoFpsRangesFor.matchPageWithKey(itemProvider, currentPage);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(this, mutatePriority, function2, continuation);
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }
}

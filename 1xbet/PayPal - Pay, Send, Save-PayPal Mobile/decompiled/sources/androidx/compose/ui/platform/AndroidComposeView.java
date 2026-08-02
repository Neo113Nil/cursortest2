package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;

@kotlin.Metadata(d1 = {"\u0000¢\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0002Ù\u0002\b\u0001\u0018\u0000 ÿ\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0006ÿ\u0004\u0080\u0005\u0081\u0005B\u0017\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010M\u001a\u00020NH\u0016J\u0017\u0010^\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`H\u0002¢\u0006\u0004\bd\u0010bJ\u0017\u0010e\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`H\u0002¢\u0006\u0004\bf\u0010bJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`H\u0016¢\u0006\u0004\bh\u0010bJ\u0019\u0010i\u001a\u0004\u0018\u00010$2\u0006\u0010_\u001a\u00020`H\u0002¢\u0006\u0004\bj\u0010kJ\n\u0010l\u001a\u0004\u0018\u00010mH\u0016J\b\u0010n\u001a\u000207H\u0016J\u0012\u0010o\u001a\u0004\u0018\u00010$2\u0006\u0010p\u001a\u00020NH\u0002JA\u0010\u009e\u0002\u001a\u00030\u009f\u00022.\u0010 \u0002\u001a)\b\u0001\u0012\u0005\u0012\u00030¢\u0002\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009f\u00020£\u0002\u0012\u0007\u0012\u0005\u0018\u00010¤\u00020¡\u0002¢\u0006\u0003\b¥\u0002H\u0096@¢\u0006\u0003\u0010¦\u0002J\u0013\u0010ã\u0002\u001a\u0002072\b\u0010ä\u0002\u001a\u00030å\u0002H\u0016J=\u0010æ\u0002\u001a\u0002072!\u0010ç\u0002\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010è\u0002j\r\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u0001`é\u00022\u0006\u0010p\u001a\u00020N2\u0007\u0010ê\u0002\u001a\u00020NH\u0016J\u0013\u0010ë\u0002\u001a\u0002072\b\u0010ì\u0002\u001a\u00030í\u0002H\u0016J.\u0010ò\u0002\u001a\u0002072\b\u0010ó\u0002\u001a\u00030å\u00022\b\u0010ô\u0002\u001a\u00030õ\u00022\u000f\u0010ö\u0002\u001a\n\u0012\u0005\u0012\u00030ø\u00020÷\u0002H\u0016J\u0013\u0010ù\u0002\u001a\u0002072\b\u0010ú\u0002\u001a\u00030û\u0002H\u0016J\u0013\u0010ü\u0002\u001a\u0002072\b\u0010ú\u0002\u001a\u00030û\u0002H\u0016J\u001e\u0010ý\u0002\u001a\u0004\u0018\u00010$2\t\u0010þ\u0002\u001a\u0004\u0018\u00010$2\u0006\u0010p\u001a\u00020NH\u0016J\u001b\u0010ÿ\u0002\u001a\u00020\u00162\u0006\u0010p\u001a\u00020N2\n\u0010\u0080\u0003\u001a\u0005\u0018\u00010å\u0002J\u001b\u0010\u0081\u0003\u001a\u00020\u00162\u0006\u0010p\u001a\u00020N2\n\u0010\u0080\u0003\u001a\u0005\u0018\u00010å\u0002J\u001b\u0010\u0082\u0003\u001a\u00020\u00162\u0006\u0010p\u001a\u00020N2\n\u0010\u0080\u0003\u001a\u0005\u0018\u00010å\u0002J\u001d\u0010\u0083\u0003\u001a\u00020\u00162\u0006\u0010p\u001a\u00020N2\n\u0010\u0080\u0003\u001a\u0005\u0018\u00010å\u0002H\u0016J$\u0010\u0084\u0003\u001a\u00020\u00162\b\u0010_\u001a\u0004\u0018\u00010`2\t\u0010\u0080\u0003\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0003\b\u0085\u0003J\t\u0010\u0086\u0003\u001a\u000207H\u0016J&\u0010\u0087\u0003\u001a\u0002072\u0007\u0010\u0088\u0003\u001a\u00020\u00162\u0006\u0010p\u001a\u00020N2\n\u0010\u0080\u0003\u001a\u0005\u0018\u00010å\u0002H\u0014J!\u0010\u0087\u0003\u001a\u0002072\n\u0010\u0089\u0003\u001a\u0005\u0018\u00010\u008a\u00032\n\u0010\u008b\u0003\u001a\u0005\u0018\u00010\u008a\u0003H\u0016J\u0012\u0010\u008c\u0003\u001a\u0002072\u0007\u0010\u008d\u0003\u001a\u00020\u0016H\u0016J\u001c\u0010\u008e\u0003\u001a\u00020\u00162\b\u0010\u008f\u0003\u001a\u00030\u0090\u0003H\u0016¢\u0006\u0006\b\u0091\u0003\u0010\u0092\u0003J\u0013\u0010\u0093\u0003\u001a\u00020\u00162\b\u0010\u0094\u0003\u001a\u00030\u0095\u0003H\u0017J\u0013\u0010\u0096\u0003\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030\u0098\u0003H\u0016J\u0013\u0010\u0099\u0003\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030\u0098\u0003H\u0016J\u0012\u0010\u009a\u0003\u001a\u0002072\u0007\u0010\u009b\u0003\u001a\u00020\u0016H\u0016J\u0013\u0010\u009c\u0003\u001a\u0002072\b\u0010\u009d\u0003\u001a\u00030è\u0001H\u0016J\u0012\u0010\u009e\u0003\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0016J\u0012\u0010 \u0003\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0016J\u0012\u0010¡\u0003\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0016J\u0012\u0010¢\u0003\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0016J\u0007\u0010£\u0003\u001a\u000207J\t\u0010¤\u0003\u001a\u000207H\u0016J\u0018\u0010¥\u0003\u001a\u0002072\r\u0010¦\u0003\u001a\b\u0012\u0004\u0012\u00020706H\u0016JC\u0010§\u0003\u001a\u00020\u00162\b\u0010¨\u0003\u001a\u00030©\u00032\b\u0010ª\u0003\u001a\u00030«\u00032\u001b\u0010¬\u0003\u001a\u0016\u0012\u0005\u0012\u00030\u00ad\u0003\u0012\u0004\u0012\u0002070\u008a\u0002¢\u0006\u0003\b¥\u0002H\u0002¢\u0006\u0006\b®\u0003\u0010¯\u0003J\u0012\u0010°\u0003\u001a\u0002072\u0007\u0010±\u0003\u001a\u00020\u0001H\u0002J&\u0010²\u0003\u001a\u0002072\u0007\u0010³\u0003\u001a\u00020N2\b\u0010´\u0003\u001a\u00030µ\u00032\b\u0010¶\u0003\u001a\u00030·\u0003H\u0002J\u0014\u0010¸\u0003\u001a\u0002072\t\u0010¹\u0003\u001a\u0004\u0018\u00010$H\u0016J\u001d\u0010¸\u0003\u001a\u0002072\t\u0010¹\u0003\u001a\u0004\u0018\u00010$2\u0007\u0010º\u0003\u001a\u00020NH\u0016J&\u0010¸\u0003\u001a\u0002072\t\u0010¹\u0003\u001a\u0004\u0018\u00010$2\u0007\u0010»\u0003\u001a\u00020N2\u0007\u0010¼\u0003\u001a\u00020NH\u0016J \u0010¸\u0003\u001a\u0002072\t\u0010¹\u0003\u001a\u0004\u0018\u00010$2\n\u0010½\u0003\u001a\u0005\u0018\u00010¾\u0003H\u0016J)\u0010¸\u0003\u001a\u0002072\t\u0010¹\u0003\u001a\u0004\u0018\u00010$2\u0007\u0010º\u0003\u001a\u00020N2\n\u0010½\u0003\u001a\u0005\u0018\u00010¾\u0003H\u0016J\u0019\u0010¿\u0003\u001a\u0002072\u0007\u0010#\u001a\u00030À\u00032\u0007\u0010Á\u0003\u001a\u00020|J\u0010\u0010Â\u0003\u001a\u0002072\u0007\u0010#\u001a\u00030À\u0003J\u001a\u0010Ã\u0003\u001a\u0002072\u0007\u0010#\u001a\u00030À\u00032\b\u0010Ä\u0003\u001a\u00030Å\u0003J\u0016\u0010Æ\u0003\u001a\u0002072\u000b\b\u0002\u0010Ç\u0003\u001a\u0004\u0018\u00010|H\u0002J\r\u0010È\u0003\u001a\u00020\u0016*\u00020|H\u0002J\u0012\u0010É\u0003\u001a\u0002072\u0007\u0010Ê\u0003\u001a\u00020\u0016H\u0016J%\u0010É\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\b\u0010Ë\u0003\u001a\u00030ã\u0001H\u0016¢\u0006\u0006\bÌ\u0003\u0010Í\u0003J\t\u0010Î\u0003\u001a\u000207H\u0002J\u001b\u0010Ï\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\u0007\u0010Ð\u0003\u001a\u00020\u0016H\u0016J-\u0010Ñ\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\u0007\u0010Ð\u0003\u001a\u00020\u00162\u0007\u0010Ò\u0003\u001a\u00020\u00162\u0007\u0010Æ\u0003\u001a\u00020\u0016H\u0016J$\u0010Ó\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\u0007\u0010Ð\u0003\u001a\u00020\u00162\u0007\u0010Ò\u0003\u001a\u00020\u0016H\u0016J\u0012\u0010Ô\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|H\u0016J\t\u0010Õ\u0003\u001a\u000207H\u0016J\u0015\u0010Ö\u0003\u001a\u0002072\n\u0010×\u0003\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u001b\u0010Ø\u0003\u001a\u0002072\u0007\u0010Ù\u0003\u001a\u00020N2\u0007\u0010Ú\u0003\u001a\u00020NH\u0014J\u0018\u0010Û\u0003\u001a\u00020N*\u00030Ü\u0003H\u0082\n¢\u0006\u0006\bÝ\u0003\u0010Þ\u0003J\u0018\u0010ß\u0003\u001a\u00020N*\u00030Ü\u0003H\u0082\n¢\u0006\u0006\bà\u0003\u0010Þ\u0003J%\u0010á\u0003\u001a\u00030Ü\u00032\u0007\u0010â\u0003\u001a\u00020N2\u0007\u0010ã\u0003\u001a\u00020NH\u0002¢\u0006\u0006\bä\u0003\u0010å\u0003J\u001c\u0010æ\u0003\u001a\u00030Ü\u00032\u0007\u0010ç\u0003\u001a\u00020NH\u0002¢\u0006\u0006\bè\u0003\u0010é\u0003J6\u0010ê\u0003\u001a\u0002072\u0007\u0010ë\u0003\u001a\u00020\u00162\u0007\u0010ì\u0003\u001a\u00020N2\u0007\u0010í\u0003\u001a\u00020N2\u0007\u0010î\u0003\u001a\u00020N2\u0007\u0010ã\u0003\u001a\u00020NH\u0014J\t\u0010ð\u0003\u001a\u000207H\u0002J\u0013\u0010ñ\u0003\u001a\u0002072\b\u0010Ä\u0003\u001a\u00030Å\u0003H\u0014Ji\u0010ò\u0003\u001a\u00030¬\u00012B\u0010ó\u0003\u001a=\u0012\u0017\u0012\u00150ô\u0003¢\u0006\u000f\bõ\u0003\u0012\n\bö\u0003\u0012\u0005\b\b(Ä\u0003\u0012\u0019\u0012\u0017\u0018\u00010÷\u0003¢\u0006\u000f\bõ\u0003\u0012\n\bö\u0003\u0012\u0005\b\b(ø\u0003\u0012\u0004\u0012\u0002070¡\u00022\r\u0010ù\u0003\u001a\b\u0012\u0004\u0012\u000207062\n\u0010ú\u0003\u001a\u0005\u0018\u00010÷\u0003H\u0016J\u0019\u0010û\u0003\u001a\u00020\u00162\b\u0010ü\u0003\u001a\u00030¬\u0001H\u0000¢\u0006\u0003\bý\u0003J\t\u0010þ\u0003\u001a\u000207H\u0016J\u0012\u0010ÿ\u0003\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|H\u0016J\u0012\u0010\u0080\u0004\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|H\u0016J\u001b\u0010\u0081\u0004\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\u0007\u0010\u0082\u0004\u001a\u00020NH\u0016J\u001b\u0010\u0083\u0004\u001a\u0002072\u0007\u0010Á\u0003\u001a\u00020|2\u0007\u0010\u0082\u0004\u001a\u00020NH\u0016J\u0016\u0010\u0084\u0004\u001a\u0002072\u000b\u0010#\u001a\u00070$j\u0003`\u0085\u0004H\u0016J\u0013\u0010\u0086\u0004\u001a\u0002072\b\u0010¦\u0003\u001a\u00030\u0087\u0004H\u0016J\u0013\u0010\u0088\u0004\u001a\u0002072\b\u0010Ä\u0003\u001a\u00030Å\u0003H\u0014J\"\u0010\u0089\u0004\u001a\u0002072\b\u0010ü\u0003\u001a\u00030¬\u00012\u0007\u0010\u008a\u0004\u001a\u00020\u0016H\u0000¢\u0006\u0003\b\u008b\u0004J\u001e\u0010\u008c\u0004\u001a\u0002072\u0015\u0010\u008d\u0004\u001a\u0010\u0012\u0005\u0012\u00030þ\u0001\u0012\u0004\u0012\u0002070\u008a\u0002J\u0010\u0010\u008e\u0004\u001a\u000207H\u0086@¢\u0006\u0003\u0010\u008f\u0004J\u0010\u0010\u0090\u0004\u001a\u000207H\u0086@¢\u0006\u0003\u0010\u008f\u0004J\u0012\u0010\u0091\u0004\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0002J\u0012\u0010\u0092\u0004\u001a\u0002072\u0007\u0010\u009f\u0003\u001a\u00020|H\u0002J\t\u0010\u0093\u0004\u001a\u000207H\u0016J\t\u0010\u0094\u0004\u001a\u000207H\u0014J#\u0010\u0095\u0004\u001a\u0004\u0018\u0001002\n\u0010\u0096\u0004\u001a\u0005\u0018\u00010û\u00022\n\u0010\u0097\u0004\u001a\u0005\u0018\u00010\u0098\u0004H\u0002J\t\u0010\u0099\u0004\u001a\u000207H\u0014J\u001e\u0010\u009a\u0004\u001a\u0002072\n\u0010ì\u0002\u001a\u0005\u0018\u00010í\u00022\u0007\u0010\u009b\u0004\u001a\u00020NH\u0016J\u001a\u0010Á\u0001\u001a\u0002072\u000f\u0010\u009c\u0004\u001a\n\u0012\u0005\u0012\u00030\u009e\u00040\u009d\u0004H\u0016J0\u0010\u009f\u0004\u001a\u0002072\b\u0010 \u0004\u001a\u00030¡\u00042\b\u0010¢\u0004\u001a\u00030ð\u00012\u0011\u0010£\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¤\u00040÷\u0002H\u0017J\u001c\u0010¥\u0004\u001a\u0002072\u0011\u0010¦\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¨\u00040§\u0004H\u0017J\u0013\u0010©\u0004\u001a\u00020\u00162\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0016J\u0013\u0010«\u0004\u001a\u00020\u00162\b\u0010\u0094\u0003\u001a\u00030\u0095\u0003H\u0002J\u0013\u0010¬\u0004\u001a\u00020\u00162\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0016J\u0013\u0010\u00ad\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u0002H\u0002J\u001d\u0010®\u0004\u001a\u00030¯\u00042\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0002¢\u0006\u0006\b°\u0004\u0010±\u0004J\u001d\u0010²\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u00022\b\u0010³\u0004\u001a\u00030Ð\u0002H\u0002J\u0013\u0010´\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u0002H\u0002J\u001d\u0010µ\u0004\u001a\u00030¯\u00042\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0002¢\u0006\u0006\b¶\u0004\u0010±\u0004J1\u0010·\u0004\u001a\u0002072\b\u0010ª\u0004\u001a\u00030Ð\u00022\u0007\u0010¸\u0004\u001a\u00020N2\b\u0010¹\u0004\u001a\u00030è\u00012\t\b\u0002\u0010º\u0004\u001a\u00020\u0016H\u0002J\u0011\u0010»\u0004\u001a\u00020\u00162\u0006\u0010p\u001a\u00020NH\u0016J\u0011\u0010¼\u0004\u001a\u00020\u00162\u0006\u0010p\u001a\u00020NH\u0016J\u0013\u0010½\u0004\u001a\u00020\u00162\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0002J\u001b\u0010¾\u0004\u001a\u00020\u00132\u0007\u0010¿\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÀ\u0004\u0010Á\u0004J\u001c\u0010¾\u0004\u001a\u0002072\b\u0010Â\u0004\u001a\u00030ò\u0001H\u0016¢\u0006\u0006\bÃ\u0004\u0010Ä\u0004J\u001b\u0010Å\u0004\u001a\u00020\u00132\u0007\u0010Æ\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÇ\u0004\u0010Á\u0004J\t\u0010È\u0004\u001a\u000207H\u0002J\u0013\u0010È\u0004\u001a\u0002072\b\u0010ª\u0004\u001a\u00030Ð\u0002H\u0002J\t\u0010É\u0004\u001a\u000207H\u0002J\t\u0010Ê\u0004\u001a\u000207H\u0002J\t\u0010Ë\u0004\u001a\u00020\u0016H\u0016J\u0016\u0010Ì\u0004\u001a\u0005\u0018\u00010Í\u00042\b\u0010Î\u0004\u001a\u00030Ï\u0004H\u0016J\u001b\u0010Ð\u0004\u001a\u00020\u00132\u0007\u0010Ñ\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÒ\u0004\u0010Á\u0004J\u001b\u0010Ó\u0004\u001a\u00020\u00132\u0007\u0010¿\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÔ\u0004\u0010Á\u0004J\u0013\u0010Õ\u0004\u001a\u0002072\b\u0010Ö\u0004\u001a\u00030´\u0001H\u0014J\t\u0010×\u0004\u001a\u000207H\u0002J\u0013\u0010Ø\u0004\u001a\u0002072\b\u0010Ö\u0004\u001a\u00030´\u0001H\u0002J\u0012\u0010Ù\u0004\u001a\u0002072\u0007\u0010·\u0002\u001a\u00020NH\u0016J\t\u0010Ú\u0004\u001a\u00020\u0016H\u0002J\u0013\u0010Û\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u0002H\u0016J\u0013\u0010Ü\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u0002H\u0002J\u0013\u0010Ý\u0004\u001a\u00020\u00162\b\u0010\u0097\u0003\u001a\u00030Ð\u0002H\u0002J\u001d\u0010Þ\u0004\u001a\u0004\u0018\u00010$2\u0007\u0010ß\u0004\u001a\u00020N2\u0007\u0010à\u0004\u001a\u00020$H\u0002J\u001d\u0010á\u0004\u001a\u00030â\u00042\b\u0010\u0097\u0003\u001a\u00030Ð\u00022\u0007\u0010ã\u0004\u001a\u00020NH\u0017J\u0012\u0010è\u0004\u001a\u0004\u0018\u00010$2\u0007\u0010ß\u0004\u001a\u00020NJ\t\u0010ê\u0004\u001a\u00020\u0016H\u0016J\t\u0010ì\u0004\u001a\u000207H\u0016J\t\u0010í\u0004\u001a\u000207H\u0016J\t\u0010ï\u0004\u001a\u000207H\u0016J\t\u0010ð\u0004\u001a\u000207H\u0016J\u0018\u0010ô\u0004\u001a\u0002072\r\u0010õ\u0004\u001a\b\u0012\u0004\u0012\u00020706H\u0016J\u0013\u0010ö\u0004\u001a\u0002072\b\u0010÷\u0004\u001a\u00030Ö\u0002H\u0017J\u001b\u0010ø\u0004\u001a\u0002072\u0007\u0010ù\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0006\bú\u0004\u0010ú\u0001J\t\u0010û\u0004\u001a\u000207H\u0016J\t\u0010ü\u0004\u001a\u000207H\u0016J\u0012\u0010ý\u0004\u001a\u0002072\u0007\u0010þ\u0004\u001a\u00020\u0016H\u0016R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002002\u0006\u0010/\u001a\u000200@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070605X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020;8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010C\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u00020JX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u000e\u0010W\u001a\u00020XX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010s\u001a\u00020tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010w\u001a\u00020x¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u001a\u0010{\u001a\u00020|X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010\u001a\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020|0\u0081\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0010\u0010\u0096\u0001\u001a\u00030\u0097\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0098\u0001\u001a\u00030\u0099\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009f\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¢\u0001\u001a\u00030£\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¦\u0001\u001a\u00030§\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u00ad\u0001\u001a\f\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010«\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010®\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010¯\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010°\u0001\u001a\u00030±\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010²\u0001\u001a\u00030³\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010µ\u0001\u001a\u00030´\u00012\u0007\u0010:\u001a\u00030´\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bº\u0001\u0010B\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u0012\u0010»\u0001\u001a\u0005\u0018\u00010¼\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u000f\u0010É\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Ê\u0001\u001a\u00030Ë\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Î\u0001\u001a\u00030Ï\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ó\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0001\u0010Õ\u0001R'\u0010Ö\u0001\u001a\u00020\u00168VX\u0096\u000e¢\u0006\u0018\n\u0000\u0012\u0005\b×\u0001\u0010\u001a\u001a\u0005\bØ\u0001\u0010F\"\u0006\bÙ\u0001\u0010Ú\u0001R\u0012\u0010Û\u0001\u001a\u0005\u0018\u00010Ü\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Ý\u0001\u001a\u00030Ü\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0012\u0010à\u0001\u001a\u0005\u0018\u00010á\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010â\u0001\u001a\u0005\u0018\u00010ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010ä\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010å\u0001\u001a\u00030æ\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010ç\u0001\u001a\u00030è\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0016\u0010ë\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010FR\u0012\u0010í\u0001\u001a\u00030î\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010ï\u0001\u001a\u00030ð\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010ñ\u0001\u001a\u00030ò\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010ó\u0001R\u0013\u0010ô\u0001\u001a\u00030ò\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010ó\u0001R\u0013\u0010õ\u0001\u001a\u00030ò\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010ó\u0001R+\u0010ö\u0001\u001a\u00030è\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b÷\u0001\u0010\u001a\u001a\u0006\bø\u0001\u0010ê\u0001\"\u0006\bù\u0001\u0010ú\u0001R\u000f\u0010û\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010ü\u0001\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000f\u0010ý\u0001\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u00012\t\u0010:\u001a\u0005\u0018\u00010þ\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0002\u0010B\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R#\u0010\u0085\u0002\u001a\u0005\u0018\u00010þ\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0086\u0002\u0010\u0081\u0002R\u001f\u0010\u0089\u0002\u001a\u0012\u0012\u0005\u0012\u00030þ\u0001\u0012\u0004\u0012\u000207\u0018\u00010\u008a\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008b\u0002\u001a\u00030\u008c\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u008d\u0002\u001a\u00030\u008e\u00028\u0016X\u0097\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008f\u0002\u0010\u001a\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001a\u0010\u0092\u0002\u001a\n\u0012\u0005\u0012\u00030\u0094\u00020\u0093\u0002X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u0095\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u0097\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u009b\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R!\u0010§\u0002\u001a\u00030¨\u00028\u0016X\u0097\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b©\u0002\u0010\u001a\u001a\u0006\bª\u0002\u0010«\u0002R3\u0010\u00ad\u0002\u001a\u00030¬\u00022\u0007\u0010:\u001a\u00030¬\u00028V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b²\u0002\u0010B\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R\u001c\u0010³\u0002\u001a\u00020N*\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R3\u0010·\u0002\u001a\u00030¶\u00022\u0007\u0010:\u001a\u00030¶\u00028V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b¼\u0002\u0010B\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R\u0018\u0010½\u0002\u001a\u00030¾\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0002\u0010À\u0002R\u0010\u0010Á\u0002\u001a\u00030Â\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Ã\u0002\u001a\u00030Ä\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ç\u0002\u001a\u00030È\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0002\u0010Ê\u0002R\u0018\u0010Ë\u0002\u001a\u00030Ì\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0002\u0010Î\u0002R\u0012\u0010Ï\u0002\u001a\u0005\u0018\u00010Ð\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ñ\u0002\u001a\u00030è\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030¬\u00010Ó\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ô\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u0001060«\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Õ\u0002\u001a\u00030Ö\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010×\u0002\u001a\u00030Ö\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010Ø\u0002\u001a\u00030Ù\u0002X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Ú\u0002R\u000f\u0010Û\u0002\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010Ü\u0002\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ý\u0002\u001a\u00030Þ\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010ß\u0002\u001a\b\u0012\u0004\u0012\u00020706X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010à\u0002\u001a\u00030á\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010â\u0002\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010î\u0002\u001a\u0005\u0018\u00010ï\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010ð\u0002\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bñ\u0002\u0010FR\u0011\u0010ï\u0003\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010ä\u0004\u001a\u00030å\u0004X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bæ\u0004\u0010ç\u0004R\u0016\u0010é\u0004\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bé\u0004\u0010FR\u000f\u0010ë\u0004\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010î\u0004\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010ñ\u0004\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0004\u0010ó\u0004¨\u0006\u0082\u0005"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/compose/ui/node/OutOfFrameExecutor;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroidx/compose/ui/focus/FocusListener;", "context", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "superclassInitComplete", "", "primaryDirectionalMotionAxisOverride", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;)V", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "frameEndScheduler", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "getFrameEndScheduler$ui", "()Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "setFrameEndScheduler$ui", "(Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;)V", "lifecycleRetainedValuesStoreOwnerEntry", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/retain/RetainedValuesStore;", "retainedValuesStore", "getRetainedValuesStore", "()Landroidx/compose/runtime/retain/RetainedValuesStore;", "outOfFrameQueue", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Function0;", "", "outOfFrameRunnable", "Ljava/lang/Runnable;", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "Landroidx/compose/runtime/MutableState;", "frameRateCategoryView", "isArrEnabled", "isArrEnabled$ui", "()Z", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "getImportantForAutofill", "", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "_windowInfo", "Landroidx/compose/ui/platform/LazyWindowInfo;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "processingRequestFocusForNextNonChildView", "moveFocusInChildrenCurrent", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocusInChildrenCurrent-3ESFkO8", "(I)Z", "moveFocusInChildrenViewFocusFix", "moveFocusInChildrenViewFocusFix-3ESFkO8", "moveFocusInChildrenBypassUnfocusableComposeView", "moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8", "moveFocusInChildren", "moveFocusInChildren-3ESFkO8", "findNextViewInEmbeddedView", "findNextViewInEmbeddedView-3ESFkO8", "(I)Landroid/view/View;", "getEmbeddedViewFocusRect", "Landroidx/compose/ui/geometry/Rect;", "focusTargetAvailable", "findNextNonChildView", "direction", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "insetsListener", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot$annotations", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "Landroidx/collection/MutableIntObjectMap;", "getLayoutNodes", "()Landroidx/collection/MutableIntObjectMap;", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "uncaughtExceptionHandler", "Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "getUncaughtExceptionHandler$ui", "()Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "setUncaughtExceptionHandler$ui", "(Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;)V", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "dirtyLayers", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/node/OwnedLayer;", "postponedDirtyLayers", "isDrawingContent", "isPendingInteropViewLayoutChangeDispatch", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "Landroid/content/res/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration$delegate", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofillManager", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "get_autofillManager$ui", "()Landroidx/compose/ui/autofill/AndroidAutofillManager;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillManager", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "observationClearRequested", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboard", "Landroidx/compose/ui/platform/AndroidClipboard;", "getClipboard", "()Landroidx/compose/ui/platform/AndroidClipboard;", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getAndroidViewsHandler$ui", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "wasMeasuredWithMultipleConstraints", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "", "getMeasureIteration", "()J", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "tmpPositionArray", "", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "viewToWindowMatrix", "windowToViewMatrix", "lastMatrixRecalculationAnimationTime", "getLastMatrixRecalculationAnimationTime$ui$annotations", "getLastMatrixRecalculationAnimationTime$ui", "setLastMatrixRecalculationAnimationTime$ui", "(J)V", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "_viewTreeOwners", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners$delegate", "viewTreeOwners", "getViewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "onViewTreeOwnersAvailable", "Lkotlin/Function1;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "textInputSession", "", "session", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "endApplyChangesListeners", "currentFrameRate", "", "currentFrameRateCategory", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "sendHoverExitEvent", "hoverExitReceived", "indirectPointerNavigationGestureDetector", "Landroidx/compose/ui/platform/IndirectPointerNavigationGestureDetector;", "resendMotionEventOnLayout", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "keyboardModifiersRequireUpdate", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "addFocusables", "views", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "focusableMode", "dispatchProvideStructure", "structure", "Landroid/view/ViewStructure;", "scrollCapture", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "scrollCaptureInProgress", "getScrollCaptureInProgress$ui", "onScrollCaptureSearch", "localVisibleRect", "windowOffset", "Landroid/graphics/Point;", "targets", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "onResume", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/lifecycle/LifecycleOwner;", "onStop", "focusSearch", "focused", "requestFocusCurrent", "previouslyFocusedRect", "requestFocusViewFocusFix", "requestFocusBypassUnfocusableComposeView", "requestFocus", "requestOwnerFocus", "requestOwnerFocus-7o62pno", "clearOwnerFocus", "onFocusChanged", "gainFocus", "previous", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "current", "onWindowFocusChanged", "hasWindowFocus", "sendKeyEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendIndirectPointerEvent", "indirectPointerEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "dispatchKeyEventPreIme", "forceAccessibilityForTesting", "enable", "setAccessibilityEventBatchIntervalMillis", "intervalMillis", "onPreAttach", "node", "onPostAttach", "onDetach", "requestAutofill", "requestClearInvalidObservations", "onEndApplyChanges", "registerOnEndApplyChangesListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startDrag", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "clearChildInvalidObservations", "viewGroup", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "addView", "child", "index", "width", "height", "params", "Landroid/view/ViewGroup$LayoutParams;", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "removeAndroidView", "drawAndroidView", "canvas", "Landroid/graphics/Canvas;", "scheduleMeasureAndLayout", "nodeToRemeasure", "childSizeCanAffectParentSize", "measureAndLayout", "sendPointerUpdate", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "dispatchPendingInteropLayoutCallbacks", "forceMeasureTheSubtree", "affectsLookahead", "onRequestMeasure", "forceRequest", "onRequestRelayout", "requestOnPositionedCallback", "measureAndLayoutForTest", "setUncaughtExceptionHandler", "handler", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "component1", "Lkotlin/ULong;", "component1-VKZWuLQ", "(J)I", "component2", "component2-VKZWuLQ", "pack", "a", util.h.xy.cb.b.f1091, "pack-ZIaKswc", "(II)J", "convertMeasureSpec", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "onLayout", "changed", "l", "t", "r", "_rootView", "updatePositionCacheAndDispatch", "onDraw", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "invalidateParentLayer", "explicitLayer", "recycle", "layer", "recycle$ui", "onSemanticsChange", "onLayoutChange", "onLayoutNodeDeactivated", "onPreLayoutNodeReused", "oldSemanticsId", "onPostLayoutNodeReused", "onInteropViewLayoutChange", "Landroidx/compose/ui/viewinterop/InteropView;", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "dispatchDraw", "notifyLayerIsDirty", "isDirty", "notifyLayerIsDirty$ui", "setOnViewTreeOwnersAvailable", com.sun.jna.Callback.METHOD_NAME, "boundsUpdatesContentCaptureEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesAccessibilityEventLoop", "invalidateLayoutNodeMeasurement", "invalidateLayers", "invalidateDescendants", "onAttachedToWindow", "installLocalRetainedValuesStore", "lifecycleOwner", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "onDetachedFromWindow", "onProvideAutofillVirtualStructure", "flags", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "requestsCollector", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "dispatchGenericMotionEvent", "motionEvent", "handleIndirectPointerEvent", "dispatchTouchEvent", "handleRotaryEvent", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "hasChangedDevices", "lastEvent", "isDevicePressEvent", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "canScrollHorizontally", "canScrollVertically", "isInBounds", "localToScreen", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localTransform", "localToScreen-58bKbWc", "([F)V", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "recalculateWindowPosition", "recalculateWindowViewTransforms", "updateWindowMetrics", "onCheckIsTextEditor", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculatePositionInWindow", "calculatePositionInWindow-MK-Hz9U", "onConfigurationChanged", "newConfig", "dispatchConfigurationChangeIfNeeded", "updateConfiguration", "onRtlPropertiesChanged", "autofillSupported", "dispatchHoverEvent", "isBadMotionEvent", "isPositionChanged", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "onResolvePointerIcon", "Landroid/view/PointerIcon;", "pointerIndex", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "findViewByAccessibilityIdTraversal", "isLifecycleInResumedState", "shouldDelayChildPressedState", "sensitiveComponentCount", "incrementSensitiveComponentCount", "decrementSensitiveComponentCount", "keepScreenOnCount", "incrementKeepScreenOnCount", "decrementKeepScreenOnCount", "outOfFrameExecutor", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "schedule", "block", "voteFrameRate", "frameRate", "dispatchOnScrollChanged", "delta", "dispatchOnScrollChanged-k-4lQ0M", "onGlobalLayout", "onScrollChanged", "onTouchModeChanged", "isInTouchMode", "Companion", "ViewTreeOwners", "RootModifierNode", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView extends android.view.ViewGroup implements androidx.compose.ui.node.Owner, androidx.compose.ui.focus.PlatformFocusOwner, androidx.compose.ui.platform.ViewRootForTest, androidx.compose.ui.input.pointer.MatrixPositionCalculator, androidx.view.DefaultLifecycleObserver, androidx.compose.ui.node.OutOfFrameExecutor, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnTouchModeChangeListener, androidx.compose.ui.focus.FocusListener {
    public static final int $stable = 8;
    private static java.lang.reflect.Method Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.AndroidComposeView.Companion INSTANCE;
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static final androidx.collection.MutableObjectList<androidx.compose.ui.platform.AndroidComposeView> getHighSpeedVideoFpsRangesFor;
    private static java.lang.Runnable getHighSpeedVideoSizes;
    private static java.lang.Class<?> getOutputMinFrameDuration;
    private androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry AMEXKernel;
    private final androidx.compose.ui.input.pointer.PointerInputEventProcessor AMEXKernelCallback;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> AMEXKernelJNI;
    private boolean AMEXKernelProvider;
    private final kotlin.collections.ArrayDeque<kotlin.jvm.functions.Function0<kotlin.Unit>> AMEXKernela;
    private boolean ArtificialStackFrames;
    private final float[] BerTlvEncoder;
    private long CoroutineDebuggingKt;
    private final androidx.compose.ui.platform.WeakCache<androidx.compose.ui.node.OwnedLayer> _BOUNDARY;
    private boolean _CREATION;
    private final androidx.compose.ui.autofill.AndroidAutofillManager _autofillManager;

    /* renamed from: a, reason: collision with root package name */
    private long f2692a;
    private final androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector accessartificialFrame;
    private final androidx.compose.ui.platform.AndroidAccessibilityManager accessibilityManager;
    private boolean aid;
    private final androidx.compose.ui.autofill.AutofillTree autofillTree;
    private int b;
    private final androidx.compose.ui.input.pointer.MotionEventAdapter c;
    private final androidx.compose.ui.platform.AndroidClipboard clipboard;
    private final androidx.compose.ui.platform.AndroidClipboardManager clipboardManager;

    /* renamed from: configuration$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState configuration;
    private androidx.compose.ui.contentcapture.AndroidContentCaptureManager contentCaptureManager;
    private boolean coroutineBoundary;
    private kotlin.coroutines.CoroutineContext coroutineContext;
    private boolean coroutineCreation;
    private final androidx.compose.ui.platform.CalculateMatrixToWindow d;

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState density;
    private final androidx.compose.ui.draganddrop.AndroidDragAndDropManager dragAndDropManager;
    private androidx.compose.ui.platform.DrawChildContainer encode;
    private final java.lang.Runnable exchange;
    private final androidx.compose.ui.focus.FocusOwner focusOwner;

    /* renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState fontFamilyResolver;
    private final androidx.compose.ui.text.font.Font.ResourceLoader fontLoader;
    private androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    private final androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 free;
    private final androidx.compose.ui.scrollcapture.ScrollCapture freeTransaction;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final androidx.compose.ui.input.InputModeManagerImpl getHighSpeedVideoSizesFor;
    private android.view.View getInputFormats;
    private androidx.compose.ui.platform.AndroidViewsHandler getInputSizeshNQ4ISI;
    private final androidx.compose.ui.autofill.AndroidAutofill getOutputFormats;
    private final androidx.compose.runtime.MutableState getOutputMinFrameDurationlomOqCM;
    private final androidx.compose.ui.platform.LazyWindowInfo getOutputSizes;
    private final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private final androidx.compose.ui.graphics.CanvasHolder getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private final androidx.compose.ui.graphics.GraphicsContext graphicsContext;
    private final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private final androidx.compose.ui.text.input.TextInputServiceAndroid init;
    private final androidx.compose.ui.layout.InsetsListener insetsListener;
    private final boolean isArrEnabled;
    private final androidx.collection.MutableObjectList<kotlin.jvm.functions.Function0<kotlin.Unit>> isOutputSupportedFor;
    private android.view.View isOutputSupportedForhNQ4ISI;
    private long kernelID;
    private final androidx.compose.ui.node.MeasureAndLayoutDelegate kernelVersion;
    private long l;
    private long lastMatrixRecalculationAnimationTime;

    /* renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState layoutDirection;
    private final androidx.collection.MutableIntObjectMap<androidx.compose.ui.node.LayoutNode> layoutNodes;
    private final androidx.compose.ui.modifier.ModifierLocalManager modifierLocalManager;
    private final int[] newContext;
    private final androidx.compose.ui.input.pointer.PointerIconService pointerIconService;
    private androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    private final float[] provide;
    private final androidx.compose.ui.spatial.RectManager rectManager;
    private androidx.compose.ui.unit.Constraints release;
    private androidx.collection.MutableObjectList<androidx.compose.ui.node.OwnedLayer> requestGoOnline;
    private boolean requestPINEntry;
    private boolean resetTransaction;
    private androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore;
    private final androidx.compose.ui.node.LayoutNode root;
    private final androidx.compose.ui.node.RootForTest rootForTest;
    private final java.lang.Runnable rsaCipher;
    private final androidx.compose.ui.semantics.SemanticsOwner semanticsOwner;
    private final float[] setup;
    private final androidx.compose.ui.semantics.EmptySemanticsModifier sha1;
    private final androidx.compose.ui.node.LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver;
    private final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<androidx.compose.ui.platform.AndroidPlatformTextInputSession>> start;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> startTransaction;
    private final androidx.compose.ui.text.input.TextInputService textInputService;
    private final androidx.compose.ui.platform.TextToolbar textToolbar;
    private final androidx.collection.MutableObjectList<androidx.compose.ui.node.OwnedLayer> toString;
    private androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;
    private float unwrapAs;
    private android.view.MotionEvent updateUI;
    private int version;
    private final androidx.compose.ui.platform.ViewConfiguration viewConfiguration;

    /* renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State viewTreeOwners;

    @kotlin.Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m7714getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @kotlin.Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v64, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(context);
        this.f2692a = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        int i = 1;
        this.AMEXKernelProvider = true;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        this.sharedDrawScope = new androidx.compose.ui.node.LayoutNodeDrawScope(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.retainedValuesStore = androidx.compose.runtime.retain.ForgetfulRetainedValuesStore.INSTANCE;
        this.AMEXKernela = new kotlin.collections.ArrayDeque<>();
        this.exchange = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoSizes(androidx.compose.ui.platform.AndroidComposeView.this);
            }
        };
        this.density = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context), androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy());
        boolean z = false;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        boolean z2 = androidx.compose.ui.ComposeUiFlags.isAdaptiveRefreshRateEnabled && android.os.Build.VERSION.SDK_INT >= 35;
        this.isArrEnabled = z2;
        androidx.compose.ui.semantics.EmptySemanticsModifier emptySemanticsModifier = new androidx.compose.ui.semantics.EmptySemanticsModifier();
        this.sha1 = emptySemanticsModifier;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        this.focusOwner = new androidx.compose.ui.focus.FocusOwnerImpl(this, androidComposeView);
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = new androidx.compose.ui.draganddrop.AndroidDragAndDropManager(new androidx.compose.ui.platform.AndroidComposeView$dragAndDropManager$1(this));
        this.getOutputSizes = new androidx.compose.ui.platform.LazyWindowInfo();
        this.getOutputStallDurationlomOqCM = new androidx.compose.ui.graphics.CanvasHolder();
        this.viewConfiguration = new androidx.compose.ui.platform.AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.insetsListener = new androidx.compose.ui.layout.InsetsListener(this);
        androidx.compose.ui.node.LayoutNode layoutNode = new androidx.compose.ui.node.LayoutNode(z, objArr8 == true ? 1 : 0, 3, objArr5 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(androidx.compose.ui.layout.RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(new androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.platform.AndroidComposeView.RootModifierNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final boolean equals(java.lang.Object other) {
                return other == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void update(androidx.compose.ui.platform.AndroidComposeView.RootModifierNode node) {
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            /* renamed from: create, reason: avoid collision after fix types in other method */
            public final androidx.compose.ui.platform.AndroidComposeView.RootModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
                return androidx.compose.ui.platform.AndroidComposeView.this.new RootModifierNode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final int hashCode() {
                return androidx.compose.ui.platform.AndroidComposeView.this.hashCode();
            }
        }.then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()));
        this.root = layoutNode;
        this.layoutNodes = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new androidx.compose.ui.spatial.RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat(this);
        this.getOutputSizeshNQ4ISI = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager(this, new androidx.compose.ui.platform.AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new androidx.compose.ui.platform.AndroidAccessibilityManager(context);
        this.graphicsContext = androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new androidx.compose.ui.autofill.AutofillTree();
        this.toString = new androidx.collection.MutableObjectList<>(objArr7 == true ? 1 : 0, i, objArr4 == true ? 1 : 0);
        this.c = new androidx.compose.ui.input.pointer.MotionEventAdapter();
        this.AMEXKernelCallback = new androidx.compose.ui.input.pointer.PointerInputEventProcessor(getRoot());
        this.configuration = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new android.content.res.Configuration(context.getResources().getConfiguration()), null, 2, null);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this;
        this.getOutputFormats = new androidx.compose.ui.autofill.AndroidAutofill(androidComposeView2, getAutofillTree());
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) context.getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager != null) {
            this._autofillManager = new androidx.compose.ui.autofill.AndroidAutofillManager(new androidx.compose.ui.autofill.PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), androidComposeView2, getRectManager(), context.getPackageName());
            this.clipboardManager = new androidx.compose.ui.platform.AndroidClipboardManager(context);
            this.clipboard = new androidx.compose.ui.platform.AndroidClipboard(getClipboardManager());
            this.snapshotObserver = new androidx.compose.ui.node.OwnerSnapshotObserver(new androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1(this));
            this.kernelVersion = new androidx.compose.ui.node.MeasureAndLayoutDelegate(getRoot());
            this.CoroutineDebuggingKt = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(9223372034707292159L);
            this.newContext = new int[]{0, 0};
            float[] m6223constructorimpl$default = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
            this.setup = m6223constructorimpl$default;
            this.BerTlvEncoder = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
            this.provide = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
            this.lastMatrixRecalculationAnimationTime = -1L;
            this.kernelID = androidx.compose.ui.geometry.Offset.INSTANCE.m5766getInfiniteF1C5BW0();
            this._CREATION = true;
            this.getOutputMinFrameDurationlomOqCM = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.viewTreeOwners = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners invoke() {
                    androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners Camera2StreamConfigurationMap2;
                    Camera2StreamConfigurationMap2 = androidx.compose.ui.platform.AndroidComposeView.this.Camera2StreamConfigurationMap();
                    return Camera2StreamConfigurationMap2;
                }

                {
                    super(0);
                }
            });
            androidx.compose.ui.text.input.TextInputServiceAndroid textInputServiceAndroid = new androidx.compose.ui.text.input.TextInputServiceAndroid(getView(), this);
            this.init = textInputServiceAndroid;
            this.textInputService = new androidx.compose.ui.text.input.TextInputService(androidx.compose.ui.platform.AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
            this.start = androidx.compose.ui.SessionMutex.m5517constructorimpl();
            this.softwareKeyboardController = new androidx.compose.ui.platform.DelegatingSoftwareKeyboardController(getTextInputService());
            this.fontLoader = new androidx.compose.ui.platform.AndroidFontResourceLoader(context);
            this.fontFamilyResolver = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.ui.text.font.FontFamilyResolver_androidKt.createFontFamilyResolver(context), androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy());
            androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
            this.layoutDirection = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? androidx.compose.ui.unit.LayoutDirection.Ltr : layoutDirection, null, 2, null);
            this.hapticFeedBack = new androidx.compose.ui.hapticfeedback.PlatformHapticFeedback(androidComposeView2);
            this.getHighSpeedVideoSizesFor = new androidx.compose.ui.input.InputModeManagerImpl(isInTouchMode() ? androidx.compose.ui.input.InputMode.INSTANCE.m6746getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m6745getKeyboardaOaMEAU(), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.InputMode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.InputMode inputMode) {
                    return getHighSpeedVideoFpsRangesFor(inputMode.getGetHighSpeedVideoFpsRangesFor());
                }

                public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(int i2) {
                    boolean requestFocusFromTouch;
                    if (androidx.compose.ui.input.InputMode.m6741equalsimpl0(i2, androidx.compose.ui.input.InputMode.INSTANCE.m6746getTouchaOaMEAU())) {
                        requestFocusFromTouch = androidx.compose.ui.platform.AndroidComposeView.this.isInTouchMode();
                    } else {
                        requestFocusFromTouch = androidx.compose.ui.input.InputMode.m6741equalsimpl0(i2, androidx.compose.ui.input.InputMode.INSTANCE.m6745getKeyboardaOaMEAU()) ? androidx.compose.ui.platform.AndroidComposeView.this.isInTouchMode() ? androidx.compose.ui.platform.AndroidComposeView.this.requestFocusFromTouch() : true : false;
                    }
                    return java.lang.Boolean.valueOf(requestFocusFromTouch);
                }

                {
                    super(1);
                }
            }, objArr3 == true ? 1 : 0);
            this.modifierLocalManager = new androidx.compose.ui.modifier.ModifierLocalManager(androidComposeView);
            this.textToolbar = new androidx.compose.ui.platform.AndroidTextToolbar(androidComposeView2);
            this._BOUNDARY = new androidx.compose.ui.platform.WeakCache<>();
            this.isOutputSupportedFor = new androidx.collection.MutableObjectList<>(objArr6 == true ? 1 : 0, i, objArr2 == true ? 1 : 0);
            this.free = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    android.view.MotionEvent motionEvent;
                    long j;
                    androidx.compose.ui.platform.AndroidComposeView.this.removeCallbacks(this);
                    motionEvent = androidx.compose.ui.platform.AndroidComposeView.this.updateUI;
                    if (motionEvent != null) {
                        boolean z3 = motionEvent.getToolType(0) == 3;
                        int actionMasked = motionEvent.getActionMasked();
                        if (z3) {
                            if (actionMasked == 10 || actionMasked == 1) {
                                return;
                            }
                        } else if (actionMasked == 1) {
                            return;
                        }
                        int i2 = 7;
                        if (actionMasked != 7 && actionMasked != 9) {
                            i2 = 2;
                        }
                        androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = androidx.compose.ui.platform.AndroidComposeView.this;
                        j = androidComposeView3.l;
                        androidComposeView3.getHighSpeedVideoFpsRanges(motionEvent, i2, j, false);
                    }
                }
            };
            this.rsaCipher = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.AndroidComposeView.this);
                }
            };
            this.accessartificialFrame = new androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector(context, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$indirectPointerNavigationGestureDetector$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusDirection focusDirection) {
                    Camera2StreamConfigurationMap(focusDirection.getCamera2StreamConfigurationMap());
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(int i2) {
                    androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5665moveFocusaToIllA(i2, false);
                }

                {
                    super(1);
                }
            });
            this.AMEXKernelJNI = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    Camera2StreamConfigurationMap();
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap() {
                    android.view.MotionEvent motionEvent;
                    androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
                    motionEvent = androidx.compose.ui.platform.AndroidComposeView.this.updateUI;
                    if (motionEvent != null) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 7 || actionMasked == 9) {
                            androidx.compose.ui.platform.AndroidComposeView.this.l = android.os.SystemClock.uptimeMillis();
                            androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = androidx.compose.ui.platform.AndroidComposeView.this;
                            androidComposeView$resendMotionEventRunnable$1 = androidComposeView3.free;
                            androidComposeView3.post(androidComposeView$resendMotionEventRunnable$1);
                        }
                    }
                }

                {
                    super(0);
                }
            };
            this.d = android.os.Build.VERSION.SDK_INT < 29 ? new androidx.compose.ui.platform.CalculateMatrixToWindowApi21(m6223constructorimpl$default, objArr == true ? 1 : 0) : new androidx.compose.ui.platform.CalculateMatrixToWindowApi29();
            addOnAttachStateChangeListener(this.contentCaptureManager);
            setWillNotDraw(false);
            setFocusable(true);
            androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO androidComposeViewVerificationHelperMethodsO = androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO.INSTANCE;
            androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO.getHighSpeedVideoFpsRanges(androidComposeView2);
            setFocusableInTouchMode(true);
            setClipChildren(false);
            androidx.core.view.ViewCompat.setAccessibilityDelegate(androidComposeView2, androidComposeViewAccessibilityDelegateCompat);
            kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ViewRootForTest, kotlin.Unit> onViewCreatedCallback = androidx.compose.ui.platform.ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
            if (onViewCreatedCallback != null) {
                onViewCreatedCallback.invoke(this);
            }
            setOnDragListener(getDragAndDropManager());
            getRoot().attach$ui(androidComposeView);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ androidComposeViewForceDarkModeQ = androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ.INSTANCE;
                androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ.getHighSpeedVideoSizes(androidComposeView2);
            }
            if (z2) {
                android.view.View view = new android.view.View(context);
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
                view.setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
                this.isOutputSupportedForhNQ4ISI = view;
                addView(view);
            }
            this.freeTransaction = android.os.Build.VERSION.SDK_INT >= 31 ? new androidx.compose.ui.scrollcapture.ScrollCapture() : null;
            this.pointerIconService = new androidx.compose.ui.input.pointer.PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
                private androidx.compose.ui.input.pointer.PointerIcon getHighSpeedVideoFpsRangesFor;

                /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
                private androidx.compose.ui.input.pointer.PointerIcon getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getDefault();

                @Override // androidx.compose.ui.input.pointer.PointerIconService
                /* renamed from: getIcon, reason: from getter */
                public final androidx.compose.ui.input.pointer.PointerIcon getGetHighResolutionOutputSizeshNQ4ISI() {
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }

                @Override // androidx.compose.ui.input.pointer.PointerIconService
                public final void setIcon(androidx.compose.ui.input.pointer.PointerIcon value) {
                    if (value == null) {
                        value = androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getDefault();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = value;
                    androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN androidComposeViewVerificationHelperMethodsN = androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.INSTANCE;
                    androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.getHighSpeedVideoFpsRanges(androidx.compose.ui.platform.AndroidComposeView.this, this.getHighResolutionOutputSizeshNQ4ISI);
                }

                @Override // androidx.compose.ui.input.pointer.PointerIconService
                /* renamed from: getStylusHoverIcon, reason: from getter */
                public final androidx.compose.ui.input.pointer.PointerIcon getGetHighSpeedVideoFpsRangesFor() {
                    return this.getHighSpeedVideoFpsRangesFor;
                }

                @Override // androidx.compose.ui.input.pointer.PointerIconService
                public final void setStylusHoverIcon(androidx.compose.ui.input.pointer.PointerIcon value) {
                    this.getHighSpeedVideoFpsRangesFor = value;
                }
            };
            return;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Autofill service could not be located.");
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m7716setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.node.LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public final android.view.View getView() {
        return this;
    }

    /* renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    public final void setFrameEndScheduler$ui(androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.runtime.retain.RetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    private void setDensity(androidx.compose.ui.unit.Density density) {
        this.density.setValue(density);
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public final androidx.compose.ui.unit.Density getDensity() {
        return (androidx.compose.ui.unit.Density) this.density.getValue();
    }

    /* renamed from: isArrEnabled$ui, reason: from getter */
    public final boolean getIsArrEnabled() {
        return this.isArrEnabled;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.focus.FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void setCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        androidx.compose.ui.node.DelegatableNode head = getRoot().getNodes().getHead();
        if (head instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) {
            ((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) head).resetPointerInputHandler();
        }
        androidx.compose.ui.node.DelegatableNode delegatableNode = head;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                                androidx.compose.ui.node.PointerInputModifierNode pointerInputModifierNode = (androidx.compose.ui.node.PointerInputModifierNode) delegatingNode;
                                if (pointerInputModifierNode instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) {
                                    ((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.draganddrop.AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.WindowInfo getWindowInfo() {
        return this.getOutputSizes;
    }

    private final boolean Camera2StreamConfigurationMap(int i) {
        android.view.View findNextFocusFromRect;
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s())) {
            return false;
        }
        java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(i);
        if (m5657toAndroidFocusDirection3ESFkO8 != null) {
            int intValue = m5657toAndroidFocusDirection3ESFkO8.intValue();
            androidx.compose.ui.geometry.Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
            android.graphics.Rect androidRect = embeddedViewFocusRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
            androidx.compose.ui.platform.FocusFinderCompat companion = androidx.compose.ui.platform.FocusFinderCompat.INSTANCE.getInstance();
            if (androidRect == null) {
                findNextFocusFromRect = companion.findNextFocus(this, findFocus(), intValue);
            } else {
                findNextFocusFromRect = companion.findNextFocusFromRect(this, androidRect, intValue);
            }
            if (findNextFocusFromRect != null) {
                return androidx.compose.ui.focus.FocusInteropUtils_androidKt.requestInteropFocus(findNextFocusFromRect, java.lang.Integer.valueOf(intValue), androidRect);
            }
            return false;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
        throw new kotlin.KotlinNothingValueException();
    }

    private final boolean getInputSizeshNQ4ISI(int i) {
        androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler;
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this.getInputSizeshNQ4ISI) == null) {
            return false;
        }
        java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(i);
        if (m5657toAndroidFocusDirection3ESFkO8 != null) {
            int intValue = m5657toAndroidFocusDirection3ESFkO8.intValue();
            android.view.View rootView = getRootView();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rootView, "");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView;
            android.view.View findFocus = viewGroup.findFocus();
            if (findFocus == null) {
                throw new java.lang.IllegalStateException("view hasFocus but root can't find it".toString());
            }
            android.view.View findNextFocus = androidx.compose.ui.platform.FocusFinderCompat.INSTANCE.getInstance().findNextFocus(viewGroup, findFocus, intValue);
            if (!androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(i) || !androidViewsHandler.hasFocus()) {
                androidx.compose.ui.geometry.Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
                r6 = embeddedViewFocusRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                if (findNextFocus != null && r6 != null) {
                    viewGroup.offsetDescendantRectToMyCoords(this, r6);
                    viewGroup.offsetRectIntoDescendantCoords(findNextFocus, r6);
                }
            }
            if (findNextFocus == null || findNextFocus == findFocus) {
                return false;
            }
            android.view.View focusedChild = androidViewsHandler.getFocusedChild();
            android.view.ViewParent parent = findNextFocus.getParent();
            while (parent != null && parent != focusedChild) {
                parent = parent.getParent();
            }
            if (parent == null) {
                return false;
            }
            return androidx.compose.ui.focus.FocusInteropUtils_androidKt.requestInteropFocus(findNextFocus, java.lang.Integer.valueOf(intValue), r6);
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
        throw new kotlin.KotlinNothingValueException();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s())) {
            return false;
        }
        java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(i);
        if (m5657toAndroidFocusDirection3ESFkO8 != null) {
            int intValue = m5657toAndroidFocusDirection3ESFkO8.intValue();
            android.view.View highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
            if (highSpeedVideoFpsRangesFor != null) {
                return androidx.compose.ui.focus.FocusInteropUtils_androidKt.requestInteropFocus(highSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(intValue), null);
            }
            return false;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: moveFocusInChildren-3ESFkO8 */
    public final boolean mo5697moveFocusInChildren3ESFkO8(int focusDirection) {
        if (androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled) {
            return getInputSizeshNQ4ISI(focusDirection);
        }
        if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            return getHighResolutionOutputSizeshNQ4ISI(focusDirection);
        }
        return Camera2StreamConfigurationMap(focusDirection);
    }

    private final android.view.View getHighSpeedVideoFpsRangesFor(int i) {
        boolean highSpeedVideoSizes;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            throw new java.lang.IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.".toString());
        }
        java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(i);
        if (m5657toAndroidFocusDirection3ESFkO8 != null) {
            int intValue = m5657toAndroidFocusDirection3ESFkO8.intValue();
            android.view.View interopView = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode).getInteropView();
            android.view.View findFocus = findFocus();
            android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
            android.view.View rootView = getRootView();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rootView, "");
            android.view.View findNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, findFocus, intValue);
            if (findNextFocus == null || interopView == null) {
                return null;
            }
            highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(interopView, findNextFocus);
            if (highSpeedVideoSizes) {
                return findNextFocus;
            }
            return null;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public final androidx.compose.ui.geometry.Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        android.view.View findFocus = findFocus();
        if (findFocus != null) {
            return androidx.compose.ui.focus.FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public final void focusTargetAvailable() {
        if (getFocusOwner().getRootState().getHasFocus()) {
            return;
        }
        focusableViewAvailable(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getHighSpeedVideoSizes(int i) {
        boolean highSpeedVideoSizes;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.compose.ui.platform.FocusFinderCompat companion = androidx.compose.ui.platform.FocusFinderCompat.INSTANCE.getInstance();
        android.view.View view = androidComposeView;
        while (view != null) {
            android.view.View rootView = getRootView();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rootView, "");
            view = companion.findNextFocus((android.view.ViewGroup) rootView, view, i);
            if (view != null) {
                highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(androidComposeView, view);
                if (!highSpeedVideoSizes) {
                    return view;
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final androidx.compose.ui.layout.InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.node.LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.collection.MutableIntObjectMap<androidx.compose.ui.node.LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.spatial.RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.node.RootForTest getRootForTest() {
        return this.rootForTest;
    }

    /* renamed from: getUncaughtExceptionHandler$ui, reason: from getter */
    public final androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.uncaughtExceptionHandler;
    }

    public final void setUncaughtExceptionHandler$ui(androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public final androidx.compose.ui.semantics.SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    /* renamed from: getContentCaptureManager$ui, reason: from getter */
    public final androidx.compose.ui.contentcapture.AndroidContentCaptureManager getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    public final void setContentCaptureManager$ui(androidx.compose.ui.contentcapture.AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.graphics.GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.autofill.AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.content.res.Configuration getConfiguration() {
        return (android.content.res.Configuration) this.configuration.getValue();
    }

    public final void setConfiguration(android.content.res.Configuration configuration) {
        this.configuration.setValue(configuration);
    }

    /* renamed from: get_autofillManager$ui, reason: from getter */
    public final androidx.compose.ui.autofill.AndroidAutofillManager get_autofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.autofill.Autofill getAutofill() {
        return this.getOutputFormats;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.node.OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // androidx.compose.ui.node.Owner
    public final boolean getShowLayoutBounds() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? androidx.compose.ui.platform.Api30Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(this) : this.showLayoutBounds;
    }

    public final androidx.compose.ui.platform.AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this.getInputSizeshNQ4ISI == null) {
            androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler = new androidx.compose.ui.platform.AndroidViewsHandler(getContext());
            this.getInputSizeshNQ4ISI = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler2 = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public final long getMeasureIteration() {
        return this.kernelVersion.getMeasureIteration();
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public final boolean getHasPendingMeasureOrLayout() {
        return this.kernelVersion.getHasPendingMeasureOrLayout() || !this.AMEXKernela.isEmpty();
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners Camera2StreamConfigurationMap() {
        return (androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners) this.getOutputMinFrameDurationlomOqCM.getValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        this.getOutputMinFrameDurationlomOqCM.setValue(viewTreeOwners);
    }

    public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners getViewTreeOwners() {
        return (androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public final androidx.compose.ui.text.input.TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.layout.Placeable.PlacementScope getPlacementScope() {
        return androidx.compose.ui.layout.PlaceableKt.PlacementScope(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object textInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) continuation;
            if ((androidComposeView$textInputSession$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = androidComposeView$textInputSession$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidComposeView$textInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<androidx.compose.ui.platform.AndroidPlatformTextInputSession>> atomicReference = this.start;
                    kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.AndroidPlatformTextInputSession> function1 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.AndroidPlatformTextInputSession>() { // from class: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.ui.platform.AndroidPlatformTextInputSession invoke(kotlinx.coroutines.CoroutineScope coroutineScope) {
                            androidx.compose.ui.platform.AndroidComposeView androidComposeView = androidx.compose.ui.platform.AndroidComposeView.this;
                            return new androidx.compose.ui.platform.AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
                        }

                        {
                            super(1);
                        }
                    };
                    androidComposeView$textInputSession$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (androidx.compose.ui.SessionMutex.m5523withSessionCancellingPreviousimpl(atomicReference, function1, function2, androidComposeView$textInputSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidComposeView$textInputSession$1 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1(this, continuation);
        java.lang.Object obj2 = androidComposeView$textInputSession$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeView$textInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.text.font.Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    private static int getHighSpeedVideoFpsRangesFor(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return (androidx.compose.ui.unit.LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.input.InputModeManager getInputModeManager() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.modifier.ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        androidComposeView.coroutineCreation = false;
        android.view.MotionEvent motionEvent = androidComposeView.updateUI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        androidComposeView.getOutputFormats(motionEvent);
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        androidx.compose.ui.geometry.Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = java.lang.Math.round(embeddedViewFocusRect.getLeft());
            rect.top = java.lang.Math.round(embeddedViewFocusRect.getTop());
            rect.right = java.lang.Math.round(embeddedViewFocusRect.getRight());
            rect.bottom = java.lang.Math.round(embeddedViewFocusRect.getBottom());
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getFocusOwner().mo5664focusSearchULY8qGw(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.TRUE;
            }
        }), java.lang.Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList<android.view.View> views, int direction, int focusableMode) {
        if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (getFocusOwner().hasFocusableContent()) {
                super.addFocusables(views, direction, focusableMode);
                if (getFocusOwner().hasNonInteropFocusableContent() || views == null) {
                    return;
                }
                views.remove(this);
                return;
            }
            return;
        }
        super.addFocusables(views, direction, focusableMode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(android.view.ViewStructure structure) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            androidx.compose.ui.platform.AndroidComposeViewAssistHelperMethodsO androidComposeViewAssistHelperMethodsO = androidx.compose.ui.platform.AndroidComposeViewAssistHelperMethodsO.INSTANCE;
            androidx.compose.ui.platform.AndroidComposeViewAssistHelperMethodsO.getHighSpeedVideoSizes(structure, getView());
        } else {
            super.dispatchProvideStructure(structure);
        }
    }

    public final boolean getScrollCaptureInProgress$ui() {
        androidx.compose.ui.scrollcapture.ScrollCapture scrollCapture;
        if (android.os.Build.VERSION.SDK_INT < 31 || (scrollCapture = this.freeTransaction) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect localVisibleRect, android.graphics.Point windowOffset, java.util.function.Consumer<android.view.ScrollCaptureTarget> targets) {
        androidx.compose.ui.scrollcapture.ScrollCapture scrollCapture;
        if (android.os.Build.VERSION.SDK_INT < 31 || (scrollCapture = this.freeTransaction) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onResume(androidx.view.LifecycleOwner owner) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(androidx.compose.ui.platform.AndroidComposeView.Companion.access$getIsShowingLayoutBounds(INSTANCE));
        }
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.AMEXKernel;
        if (retainedValuesStoreEntry != null) {
            androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            kotlin.jvm.internal.Intrinsics.checkNotNull(frameEndScheduler);
            retainedValuesStoreEntry.stopRetainingExitedValues(frameEndScheduler);
        }
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onStop(androidx.view.LifecycleOwner owner) {
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.AMEXKernel;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.startRetainingExitedValues();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View focusSearch(android.view.View focused, int direction) {
        androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo;
        boolean highSpeedVideoSizes;
        if (focused == null || this.kernelVersion.getDuringMeasureLayout()) {
            return super.focusSearch(focused, direction);
        }
        android.view.View rootView = getRootView();
        kotlin.jvm.internal.Intrinsics.checkNotNull(rootView, "");
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus((android.view.ViewGroup) rootView, focused, direction);
        if (findNextFocus != null) {
            highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(this, findNextFocus);
        }
        findNextFocus = null;
        if (focused != this || (calculateFocusRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            calculateFocusRectRelativeTo = androidx.compose.ui.focus.FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(focused, this);
        }
        androidx.compose.ui.focus.FocusDirection focusDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toFocusDirection(direction);
        int camera2StreamConfigurationMap = focusDirection != null ? focusDirection.getCamera2StreamConfigurationMap() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        if (getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, calculateFocusRectRelativeTo, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                objectRef.element = focusTargetNode;
                return java.lang.Boolean.TRUE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }) == null) {
            return focused;
        }
        if (objectRef.element == 0) {
            if (findNextFocus == null) {
                return super.focusSearch(focused, direction);
            }
        } else {
            if (findNextFocus == null) {
                return this;
            }
            if (androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(camera2StreamConfigurationMap)) {
                if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                    return this;
                }
                return super.focusSearch(focused, direction);
            }
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
            if (androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5701isBetterCandidateI7lrPNg(androidx.compose.ui.focus.FocusTraversalKt.focusRect((androidx.compose.ui.focus.FocusTargetNode) objectRef.element), androidx.compose.ui.focus.FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findNextFocus, androidComposeView), calculateFocusRectRelativeTo, camera2StreamConfigurationMap)) {
                return androidComposeView;
            }
        }
        return findNextFocus;
    }

    public final boolean requestFocusCurrent(int direction, android.graphics.Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        androidx.compose.ui.focus.FocusDirection focusDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toFocusDirection(direction);
        final int camera2StreamConfigurationMap = focusDirection != null ? focusDirection.getCamera2StreamConfigurationMap() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s();
        return kotlin.jvm.internal.Intrinsics.areEqual(getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, previouslyFocusedRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusCurrent$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(camera2StreamConfigurationMap));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), java.lang.Boolean.TRUE);
    }

    public final boolean requestFocusViewFocusFix(int direction, android.graphics.Rect previouslyFocusedRect) {
        android.view.View highSpeedVideoSizes;
        if (isFocused()) {
            return true;
        }
        if (this.requestPINEntry) {
            return false;
        }
        androidx.compose.ui.focus.FocusDirection focusDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toFocusDirection(direction);
        final int camera2StreamConfigurationMap = focusDirection != null ? focusDirection.getCamera2StreamConfigurationMap() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s();
        if (hasFocus() && mo5697moveFocusInChildren3ESFkO8(camera2StreamConfigurationMap)) {
            return true;
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        java.lang.Boolean mo5664focusSearchULY8qGw = getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, previouslyFocusedRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(camera2StreamConfigurationMap));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (mo5664focusSearchULY8qGw == null) {
            return false;
        }
        if (mo5664focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (booleanRef.element) {
            return false;
        }
        if ((previouslyFocusedRect != null && !hasFocus() && kotlin.jvm.internal.Intrinsics.areEqual(getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusViewFocusFix$altFocus$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(camera2StreamConfigurationMap));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), java.lang.Boolean.TRUE)) || (highSpeedVideoSizes = getHighSpeedVideoSizes(direction)) == null || highSpeedVideoSizes == this) {
            return true;
        }
        this.requestPINEntry = true;
        boolean requestFocus = highSpeedVideoSizes.requestFocus(direction);
        this.requestPINEntry = false;
        return requestFocus;
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int direction, android.graphics.Rect previouslyFocusedRect) {
        boolean isFocused = isFocused();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (isFocused) {
            return true;
        }
        androidx.compose.ui.focus.FocusDirection focusDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toFocusDirection(direction);
        final int camera2StreamConfigurationMap = focusDirection != null ? focusDirection.getCamera2StreamConfigurationMap() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s();
        if (kotlin.jvm.internal.Intrinsics.areEqual(getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, previouslyFocusedRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(camera2StreamConfigurationMap));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), bool)) {
            return true;
        }
        if (androidx.compose.ui.ComposeUiFlags.isIgnoreInvalidPrevFocusRectEnabled && kotlin.jvm.internal.Intrinsics.areEqual(getFocusOwner().mo5664focusSearchULY8qGw(camera2StreamConfigurationMap, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(camera2StreamConfigurationMap));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), bool)) {
            return true;
        }
        if (hasFocus() && androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(camera2StreamConfigurationMap)) {
            return getFocusOwner().mo5667resetFocus3ESFkO8(camera2StreamConfigurationMap);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) {
        if (androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled) {
            return requestFocusViewFocusFix(direction, previouslyFocusedRect);
        }
        if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            return requestFocusBypassUnfocusableComposeView(direction, previouslyFocusedRect);
        }
        return requestFocusCurrent(direction, previouslyFocusedRect);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: requestOwnerFocus-7o62pno */
    public final boolean mo5698requestOwnerFocus7o62pno(androidx.compose.ui.focus.FocusDirection focusDirection, androidx.compose.ui.geometry.Rect previouslyFocusedRect) {
        java.lang.Integer m5657toAndroidFocusDirection3ESFkO8;
        if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(focusDirection.getCamera2StreamConfigurationMap())) == null) ? 130 : m5657toAndroidFocusDirection3ESFkO8.intValue(), previouslyFocusedRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(previouslyFocusedRect) : null);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public final void clearOwnerFocus() {
        if (isFocused() || (!androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            android.view.View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public final void onFocusChanged(androidx.compose.ui.focus.FocusTargetModifierNode previous, androidx.compose.ui.focus.FocusTargetModifierNode current) {
        int i;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.NodeChain nodes2;
        if (!androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || previous == null) {
            return;
        }
        androidx.compose.ui.focus.FocusTargetModifierNode focusTargetModifierNode = previous;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = focusTargetModifierNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        java.util.LinkedHashSet linkedHashSet = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(node2);
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (arrayList != null) {
            if (current != null) {
                androidx.compose.ui.focus.FocusTargetModifierNode focusTargetModifierNode2 = current;
                int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
                if (!focusTargetModifierNode2.getNode().getIsAttached()) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.Modifier.Node node3 = focusTargetModifierNode2.getNode();
                androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode2);
                java.util.LinkedHashSet linkedHashSet2 = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                        while (node3 != null) {
                            if ((node3.getKindSet() & m7621constructorimpl2) != 0) {
                                androidx.compose.ui.Modifier.Node node4 = node3;
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                while (node4 != null) {
                                    if (node4 instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new java.util.LinkedHashSet();
                                        }
                                        linkedHashSet2.add(node4);
                                    } else if ((node4.getKindSet() & m7621constructorimpl2) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i3 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node4).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node4 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node4 != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node4);
                                                        }
                                                        node4 = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate2);
                                                    }
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    node4 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                                }
                            }
                            node3 = node3.getParent();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                    node3 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode indirectPointerInputModifierNode = (androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) arrayList.get(i);
                if (linkedHashSet == null || !linkedHashSet.contains(indirectPointerInputModifierNode)) {
                    indirectPointerInputModifierNode.onCancelIndirectPointerInput();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean access$getIsShowingLayoutBounds;
        this.getOutputSizes.setWindowFocused(hasWindowFocus);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || android.os.Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (access$getIsShowingLayoutBounds = androidx.compose.ui.platform.AndroidComposeView.Companion.access$getIsShowingLayoutBounds(INSTANCE))) {
            return;
        }
        setShowLayoutBounds(access$getIsShowingLayoutBounds);
        invalidateDescendants();
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public final boolean mo7689sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo5662dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || androidx.compose.ui.focus.FocusOwner.m5660dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public final boolean sendIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent) {
        if (androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent).getActionMasked() == 3) {
            getFocusOwner().dispatchIndirectPointerCancel();
            return true;
        }
        return Camera2StreamConfigurationMap(indirectPointerEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final android.view.KeyEvent event) {
        if (isFocused()) {
            this.getOutputSizes.m7769setKeyboardModifiers5xRPYO0(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7291constructorimpl(event.getMetaState()));
            return androidx.compose.ui.focus.FocusOwner.m5660dispatchKeyEventYhN2O0w$default(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.m7073constructorimpl(event), null, 2, null) || super.dispatchKeyEvent(event);
        }
        return getFocusOwner().mo5663dispatchKeyEventYhN2O0w(androidx.compose.ui.input.key.KeyEvent.m7073constructorimpl(event), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                boolean dispatchKeyEvent;
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent(event);
                return java.lang.Boolean.valueOf(dispatchKeyEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent event) {
        return (isFocused() && getFocusOwner().mo5662dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m7073constructorimpl(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public final void forceAccessibilityForTesting(boolean enable) {
        this.getOutputSizeshNQ4ISI.setAccessibilityForceEnabledForTesting$ui(enable);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public final void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.getOutputSizeshNQ4ISI.setSendRecurringAccessibilityEventsIntervalMillis$ui(intervalMillis);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onPreAttach(androidx.compose.ui.node.LayoutNode node) {
        getLayoutNodes().set(node.getSemanticsId(), node);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onPostAttach(androidx.compose.ui.node.LayoutNode node) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (!androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostAttach$ui(node);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onDetach(androidx.compose.ui.node.LayoutNode node) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().remove(node.getSemanticsId());
        this.kernelVersion.onNodeDetached(node);
        requestClearInvalidObservations();
        if (!androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onDetach$ui(node);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void requestAutofill(androidx.compose.ui.node.LayoutNode node) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (!androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.requestAutofill$ui(node);
    }

    public final void requestClearInvalidObservations() {
        this.resetTransaction = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onEndApplyChanges() {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (this.resetTransaction) {
            getSnapshotObserver().clearInvalidObservations$ui();
            this.resetTransaction = false;
        }
        androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler = this.getInputSizeshNQ4ISI;
        if (androidViewsHandler != null) {
            getHighSpeedVideoFpsRanges(androidViewsHandler);
        }
        if (androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui();
        }
        while (this.isOutputSupportedFor.isNotEmpty() && this.isOutputSupportedFor.get(0) != null) {
            int size = this.isOutputSupportedFor.getSize();
            for (int i = 0; i < size; i++) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.isOutputSupportedFor.get(i);
                this.isOutputSupportedFor.set(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.isOutputSupportedFor.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void registerOnEndApplyChangesListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        if (this.isOutputSupportedFor.contains(listener)) {
            return;
        }
        this.isOutputSupportedFor.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoSizes(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        android.content.res.Resources resources = getContext().getResources();
        androidx.compose.ui.draganddrop.ComposeDragShadowBuilder composeDragShadowBuilder = new androidx.compose.ui.draganddrop.ComposeDragShadowBuilder(androidx.compose.ui.unit.DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, function1, null);
        androidx.compose.ui.platform.AndroidComposeViewStartDragAndDropN androidComposeViewStartDragAndDropN = androidx.compose.ui.platform.AndroidComposeViewStartDragAndDropN.INSTANCE;
        return androidx.compose.ui.platform.AndroidComposeViewStartDragAndDropN.Camera2StreamConfigurationMap(this, dragAndDropTransferData, composeDragShadowBuilder);
    }

    private final void getHighSpeedVideoFpsRanges(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof androidx.compose.ui.platform.AndroidComposeView) {
                ((androidx.compose.ui.platform.AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof android.view.ViewGroup) {
                getHighSpeedVideoFpsRanges((android.view.ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        int orDefault;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, this.getOutputSizeshNQ4ISI.getExtraDataTestTraversalBeforeVal())) {
            int orDefault2 = this.getOutputSizeshNQ4ISI.getIdToBeforeMap().getOrDefault(i, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, this.getOutputSizeshNQ4ISI.getExtraDataTestTraversalAfterVal()) || (orDefault = this.getOutputSizeshNQ4ISI.getIdToAfterMap().getOrDefault(i, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View child) {
        addView(child, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View child, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(child);
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View child, int width, int height) {
        android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = width;
        generateDefaultLayoutParams.height = height;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        addView(child, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    public final void addAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder view, final androidx.compose.ui.node.LayoutNode layoutNode) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(view, layoutNode);
        androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = view;
        getAndroidViewsHandler$ui().addView(androidViewHolder);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(androidViewHolder, new androidx.core.view.AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
            
                if (r0.intValue() == r4.getHighSpeedVideoFpsRanges.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L19;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onInitializeAccessibilityNodeInfo(android.view.View host, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat4;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat5;
                super.onInitializeAccessibilityNodeInfo(host, info);
                androidComposeViewAccessibilityDelegateCompat = androidx.compose.ui.platform.AndroidComposeView.this.getOutputSizeshNQ4ISI;
                if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui()) {
                    info.setVisibleToUser(false);
                }
                androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
                while (true) {
                    if (parent$ui == null) {
                        parent$ui = null;
                        break;
                    } else if (parent$ui.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) {
                        break;
                    } else {
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                java.lang.Integer valueOf = parent$ui != null ? java.lang.Integer.valueOf(parent$ui.getSemanticsId()) : null;
                if (valueOf != null) {
                }
                valueOf = -1;
                info.setParent(this, valueOf.intValue());
                int semanticsId = layoutNode.getSemanticsId();
                androidComposeViewAccessibilityDelegateCompat2 = androidx.compose.ui.platform.AndroidComposeView.this.getOutputSizeshNQ4ISI;
                int orDefault = androidComposeViewAccessibilityDelegateCompat2.getIdToBeforeMap().getOrDefault(semanticsId, -1);
                if (orDefault != -1) {
                    android.view.View semanticsIdToView = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(androidx.compose.ui.platform.AndroidComposeView.this.getAndroidViewsHandler$ui(), orDefault);
                    if (semanticsIdToView != null) {
                        info.setTraversalBefore(semanticsIdToView);
                    } else {
                        info.setTraversalBefore(this, orDefault);
                    }
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = androidx.compose.ui.platform.AndroidComposeView.this;
                    android.view.accessibility.AccessibilityNodeInfo unwrap = info.unwrap();
                    androidComposeViewAccessibilityDelegateCompat5 = androidx.compose.ui.platform.AndroidComposeView.this.getOutputSizeshNQ4ISI;
                    androidComposeView.getHighResolutionOutputSizeshNQ4ISI(semanticsId, unwrap, androidComposeViewAccessibilityDelegateCompat5.getExtraDataTestTraversalBeforeVal());
                }
                androidComposeViewAccessibilityDelegateCompat3 = androidx.compose.ui.platform.AndroidComposeView.this.getOutputSizeshNQ4ISI;
                int orDefault2 = androidComposeViewAccessibilityDelegateCompat3.getIdToAfterMap().getOrDefault(semanticsId, -1);
                if (orDefault2 != -1) {
                    android.view.View semanticsIdToView2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(androidx.compose.ui.platform.AndroidComposeView.this.getAndroidViewsHandler$ui(), orDefault2);
                    if (semanticsIdToView2 != null) {
                        info.setTraversalAfter(semanticsIdToView2);
                    } else {
                        info.setTraversalAfter(this, orDefault2);
                    }
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = androidx.compose.ui.platform.AndroidComposeView.this;
                    android.view.accessibility.AccessibilityNodeInfo unwrap2 = info.unwrap();
                    androidComposeViewAccessibilityDelegateCompat4 = androidx.compose.ui.platform.AndroidComposeView.this.getOutputSizeshNQ4ISI;
                    androidComposeView2.getHighResolutionOutputSizeshNQ4ISI(semanticsId, unwrap2, androidComposeViewAccessibilityDelegateCompat4.getExtraDataTestTraversalAfterVal());
                }
            }
        });
    }

    public final void removeAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder view) {
        getAndroidViewsHandler$ui().removeViewInLayout(view);
        java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        kotlin.jvm.internal.TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(view));
        view.setImportantForAccessibility(0);
    }

    public final void drawAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder view, android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui().drawView(view, canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock && getHighResolutionOutputSizeshNQ4ISI(layoutNode)) {
                layoutNode = layoutNode.getParent$ui();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (this.aid) {
            return true;
        }
        androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui == null || parent$ui.getHasFixedInnerContentConstraints$ui()) ? false : true;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void measureAndLayout(boolean sendPointerUpdate) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        if (this.kernelVersion.getHasPendingMeasureOrLayout() || this.kernelVersion.getHasPendingOnPositionedCallbacks()) {
            android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    function0 = this.AMEXKernelJNI;
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.kernelVersion.measureAndLayout(function0)) {
                requestLayout();
            }
            androidx.compose.ui.node.MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.kernelVersion, false, 1, null);
            getHighSpeedVideoSizes();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
        }
    }

    private final void getHighSpeedVideoSizes() {
        if (this.coroutineBoundary) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.coroutineBoundary = false;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        this.kernelVersion.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onRequestMeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.kernelVersion.requestLookaheadRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                Camera2StreamConfigurationMap(layoutNode);
                return;
            }
            return;
        }
        if (this.kernelVersion.requestRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            Camera2StreamConfigurationMap(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onRequestRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.kernelVersion.requestLookaheadRelayout(layoutNode, forceRequest)) {
                Camera2StreamConfigurationMap((androidx.compose.ui.node.LayoutNode) null);
            }
        } else if (this.kernelVersion.requestRelayout(layoutNode, forceRequest)) {
            Camera2StreamConfigurationMap((androidx.compose.ui.node.LayoutNode) null);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void requestOnPositionedCallback(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.kernelVersion.requestOnPositionedCallback(layoutNode);
        Camera2StreamConfigurationMap((androidx.compose.ui.node.LayoutNode) null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public final void measureAndLayoutForTest() {
        androidx.compose.ui.node.Owner.measureAndLayout$default(this, false, 1, null);
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.exchange);
        }
        this.exchange.run();
    }

    @Override // androidx.compose.ui.node.RootForTest
    public final void setUncaughtExceptionHandler(androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler handler) {
        this.uncaughtExceptionHandler = handler;
        this.kernelVersion.setUncaughtExceptionHandler$ui(handler);
    }

    private static long getHighSpeedVideoFpsRangesFor(int i, int i2) {
        return kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(i2) | kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(i) << 32));
    }

    private static long getHighSpeedVideoFpsRanges(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return getHighSpeedVideoFpsRangesFor(0, size);
        }
        if (mode == 0) {
            return getHighSpeedVideoFpsRangesFor(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return getHighSpeedVideoFpsRangesFor(size, size);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.kernelVersion.measureAndLayout(this.AMEXKernelJNI);
        this.release = null;
        getInputSizeshNQ4ISI();
        if (this.getInputSizeshNQ4ISI != null) {
            getAndroidViewsHandler$ui().layout(0, 0, r - l, b - t);
        }
    }

    private final void getInputSizeshNQ4ISI() {
        getLocationOnScreen(this.newContext);
        long j = this.CoroutineDebuggingKt;
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(j);
        int[] iArr = this.newContext;
        boolean z = false;
        int i = iArr[0];
        if (m8729getXimpl != i || m8730getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.CoroutineDebuggingKt = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (iArr[1] & 4294967295L));
            if (m8729getXimpl != Integer.MAX_VALUE && m8730getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        getHighSpeedVideoFpsRangesFor();
        android.view.View view = this.getInputFormats;
        if (view == null) {
            view = getRootView();
            this.getInputFormats = view;
        }
        getRectManager().m7818updateOffsetsgTq6Wqs(this.CoroutineDebuggingKt, androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(this.kernelID), this.BerTlvEncoder, view.getWidth(), view.getHeight());
        this.kernelVersion.dispatchOnPositionedCallbacks(z);
        getRectManager().dispatchCallbacks();
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.node.OwnedLayer createLayer(kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer, androidx.compose.ui.graphics.layer.GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            return new androidx.compose.ui.platform.GraphicsLayerOwnerLayer(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        androidx.compose.ui.node.OwnedLayer pop = this._BOUNDARY.pop();
        if (pop != null) {
            pop.reuseLayer(drawBlock, invalidateParentLayer);
            return pop;
        }
        return new androidx.compose.ui.platform.GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
    }

    public final boolean recycle$ui(androidx.compose.ui.node.OwnedLayer layer) {
        if (this.encode != null) {
            androidx.compose.ui.platform.ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this._BOUNDARY.push(layer);
        this.toString.remove(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onSemanticsChange() {
        this.getOutputSizeshNQ4ISI.onSemanticsChange$ui();
        this.contentCaptureManager.onSemanticsChange$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onLayoutChange(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.getOutputSizeshNQ4ISI.onLayoutChange$ui(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onLayoutNodeDeactivated(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (!androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onLayoutNodeDeactivated$ui(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onPreLayoutNodeReused(androidx.compose.ui.node.LayoutNode layoutNode, int oldSemanticsId) {
        getLayoutNodes().remove(oldSemanticsId);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onPostLayoutNodeReused(androidx.compose.ui.node.LayoutNode layoutNode, int oldSemanticsId) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (!androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostLayoutNodeReused$ui(layoutNode, oldSemanticsId);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void onInteropViewLayoutChange(android.view.View view) {
        this.coroutineBoundary = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void registerOnLayoutCompletedListener(androidx.compose.ui.node.Owner.OnLayoutCompletedListener listener) {
        this.kernelVersion.registerOnLayoutCompletedListener(listener);
        Camera2StreamConfigurationMap((androidx.compose.ui.node.LayoutNode) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            getHighSpeedVideoFpsRanges(getRoot());
        }
        android.view.View view = null;
        androidx.compose.ui.node.Owner.measureAndLayout$default(this, false, 1, null);
        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
        this.ArtificialStackFrames = true;
        try {
            androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.getOutputStallDurationlomOqCM;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            getRoot().draw$ui(canvasHolder.getAndroidCanvas(), null);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            if (this.toString.isNotEmpty()) {
                int size = this.toString.getSize();
                for (int i = 0; i < size; i++) {
                    this.toString.get(i).updateDisplayList();
                }
            }
            if (androidx.compose.ui.platform.ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
                int save = canvas.save();
                canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
            }
            this.toString.clear();
            this.ArtificialStackFrames = false;
        } catch (java.lang.Throwable th) {
            androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
            if (uncaughtExceptionHandler == null) {
                throw th;
            }
            uncaughtExceptionHandler.onUncaughtException(th);
        }
        androidx.collection.MutableObjectList<androidx.compose.ui.node.OwnedLayer> mutableObjectList = this.requestGoOnline;
        if (mutableObjectList != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectList);
            this.toString.addAll(mutableObjectList);
            mutableObjectList.clear();
        }
        if (this.isArrEnabled) {
            androidx.compose.ui.platform.Api35Impl.getHighSpeedVideoFpsRanges(this, this.getOutputStallDuration);
            android.view.View view2 = this.isOutputSupportedForhNQ4ISI;
            if (view2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            androidx.compose.ui.platform.Api35Impl.getHighSpeedVideoFpsRanges(view2, this.unwrapAs);
            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                android.view.View view3 = this.isOutputSupportedForhNQ4ISI;
                if (view3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    view3 = null;
                }
                view3.invalidate();
                android.view.View view4 = this.isOutputSupportedForhNQ4ISI;
                if (view4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.getOutputStallDuration = Float.NaN;
            this.unwrapAs = Float.NaN;
        }
        getRectManager().dispatchCallbacks();
    }

    public final void notifyLayerIsDirty$ui(androidx.compose.ui.node.OwnedLayer layer, boolean isDirty) {
        if (!isDirty) {
            if (this.ArtificialStackFrames) {
                return;
            }
            this.toString.remove(layer);
            androidx.collection.MutableObjectList<androidx.compose.ui.node.OwnedLayer> mutableObjectList = this.requestGoOnline;
            if (mutableObjectList != null) {
                mutableObjectList.remove(layer);
                return;
            }
            return;
        }
        if (this.ArtificialStackFrames) {
            androidx.collection.MutableObjectList<androidx.compose.ui.node.OwnedLayer> mutableObjectList2 = this.requestGoOnline;
            if (mutableObjectList2 == null) {
                mutableObjectList2 = new androidx.collection.MutableObjectList<>(0, 1, null);
                this.requestGoOnline = mutableObjectList2;
            }
            mutableObjectList2.add(layer);
            return;
        }
        this.toString.add(layer);
    }

    public final void setOnViewTreeOwnersAvailable(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> callback) {
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.startTransaction = callback;
    }

    public final java.lang.Object boundsUpdatesContentCaptureEventLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object boundsUpdatesEventLoop$ui = this.contentCaptureManager.boundsUpdatesEventLoop$ui(continuation);
        return boundsUpdatesEventLoop$ui == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? boundsUpdatesEventLoop$ui : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object boundsUpdatesAccessibilityEventLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object boundsUpdatesEventLoop$ui = this.getOutputSizeshNQ4ISI.boundsUpdatesEventLoop$ui(continuation);
        return boundsUpdatesEventLoop$ui == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? boundsUpdatesEventLoop$ui : kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.MeasureAndLayoutDelegate.requestRemeasure$default(this.kernelVersion, layoutNode, false, 2, null);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoSizes(layoutNodeArr[i]);
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoFpsRanges(layoutNodeArr[i]);
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public final void invalidateDescendants() {
        getHighSpeedVideoFpsRanges(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        androidx.view.LifecycleOwner lifecycleOwner;
        androidx.view.Lifecycle lifecycle;
        androidx.view.LifecycleOwner lifecycleOwner2;
        super.onAttachedToWindow();
        if (android.os.Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(androidx.compose.ui.platform.AndroidComposeView.Companion.access$getIsShowingLayoutBounds(INSTANCE));
        }
        if (androidx.compose.ui.ComposeUiFlags.areWindowInsetsRulersEnabled) {
            this.insetsListener.onViewAttachedToWindow(this);
        }
        androidx.compose.ui.platform.AndroidComposeView.Companion companion = INSTANCE;
        androidx.compose.ui.platform.AndroidComposeView.Companion.getHighSpeedVideoSizes(this);
        this.getOutputSizes.setWindowFocused(hasWindowFocus());
        this.getOutputSizes.setOnInitializeContainerSize(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize>() { // from class: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.platform.DerivedSize invoke() {
                return androidx.compose.ui.platform.AndroidWindowInfo_androidKt.calculateWindowSize(androidx.compose.ui.platform.AndroidComposeView.this);
            }

            {
                super(0);
            }
        });
        getInputFormats();
        getHighSpeedVideoSizes(getRoot());
        getHighSpeedVideoFpsRanges(getRoot());
        getSnapshotObserver().startObserving$ui();
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill = this.getOutputFormats;
        if (androidAutofill != null) {
            androidx.compose.ui.autofill.AutofillCallback.INSTANCE.register(androidAutofill);
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.view.LifecycleOwner lifecycleOwner3 = androidx.view.C0276ViewTreeLifecycleOwner.get(androidComposeView);
        androidx.view.SavedStateRegistryOwner savedStateRegistryOwner = androidx.view.C0291ViewTreeSavedStateRegistryOwner.get(androidComposeView);
        androidx.view.ViewModelStoreOwner viewModelStoreOwner = androidx.view.C0278ViewTreeViewModelStoreOwner.get(androidComposeView);
        androidx.compose.runtime.retain.ForgetfulRetainedValuesStore highSpeedVideoSizes = getHighSpeedVideoSizes(lifecycleOwner3, viewModelStoreOwner);
        if (highSpeedVideoSizes == null) {
            highSpeedVideoSizes = androidx.compose.runtime.retain.ForgetfulRetainedValuesStore.INSTANCE;
        }
        this.retainedValuesStore = highSpeedVideoSizes;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        androidx.view.Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getSavedStateRegistryOwner() || viewModelStoreOwner != viewTreeOwners.getViewModelStoreOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners2 = new androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner, viewModelStoreOwner);
            getHighSpeedVideoFpsRangesFor(viewTreeOwners2);
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> function1 = this.startTransaction;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.startTransaction = null;
        }
        this.getHighSpeedVideoSizesFor.m6749setInputModeiuPiT84(isInTouchMode() ? androidx.compose.ui.input.InputMode.INSTANCE.m6746getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m6745getKeyboardaOaMEAU());
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
            lifecycle2.addObserver(this.contentCaptureManager);
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(androidComposeView);
            }
            androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager = this._autofillManager;
            if (androidAutofillManager != null) {
                getFocusOwner().getListeners().add(androidAutofillManager);
                getSemanticsOwner().getListeners$ui().add(androidAutofillManager);
            }
            getFocusOwner().getListeners().add(this);
            return;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new kotlin.KotlinNothingValueException();
    }

    private final androidx.compose.runtime.retain.RetainedValuesStore getHighSpeedVideoSizes(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (lifecycleOwner == null || viewModelStoreOwner == null || frameEndScheduler == null) {
            return null;
        }
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner) androidx.view.ViewModelProvider.Companion.create$default(androidx.view.ViewModelProvider.INSTANCE, viewModelStoreOwner.getGetHighSpeedVideoSizes(), new androidx.lifecycle.ViewModelProvider.NewInstanceFactory(), (androidx.view.viewmodel.CreationExtras) null, 4, (java.lang.Object) null).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.class));
        java.lang.Object parent = getParent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "");
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry orCreateRetainedValuesStoreEntry = lifecycleRetainedValuesStoreOwner.getOrCreateRetainedValuesStoreEntry(((android.view.View) parent).getId());
        this.AMEXKernel = orCreateRetainedValuesStoreEntry;
        return orCreateRetainedValuesStoreEntry.getRetainedValuesStore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        androidx.view.LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        if (androidx.compose.ui.ComposeUiFlags.areWindowInsetsRulersEnabled) {
            this.insetsListener.onViewDetachedFromWindow(this);
        }
        if (this.isArrEnabled) {
            android.view.View view = this.isOutputSupportedForhNQ4ISI;
            if (view == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                view = null;
            }
            removeView(view);
        }
        androidx.compose.ui.platform.AndroidComposeView.Companion companion = INSTANCE;
        androidx.compose.ui.platform.AndroidComposeView.Companion.getHighResolutionOutputSizeshNQ4ISI(this);
        getSnapshotObserver().stopObserving$ui();
        this.getOutputSizes.setOnInitializeContainerSize(null);
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        androidx.view.Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle != null) {
            lifecycle.removeObserver(this.contentCaptureManager);
            lifecycle.removeObserver(this);
            androidx.compose.ui.autofill.AndroidAutofill androidAutofill = this.getOutputFormats;
            if (androidAutofill != null) {
                androidx.compose.ui.autofill.AutofillCallback.INSTANCE.unregister(androidAutofill);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            getViewTreeObserver().removeOnScrollChangedListener(this);
            getViewTreeObserver().removeOnTouchModeChangeListener(this);
            androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.AMEXKernel;
            if (retainedValuesStoreEntry != null) {
                retainedValuesStoreEntry.release();
            }
            this.AMEXKernel = null;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
            }
            androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager = this._autofillManager;
            if (androidAutofillManager != null) {
                getSemanticsOwner().getListeners$ui().remove(androidAutofillManager);
                getFocusOwner().getListeners().remove(androidAutofillManager);
            }
            getRectManager().removeScheduledCallback();
            getFocusOwner().getListeners().remove(this);
            return;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int flags) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (structure != null) {
            if (androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
                androidAutofillManager.populateViewStructure(structure);
            }
            androidx.compose.ui.autofill.AndroidAutofill androidAutofill = this.getOutputFormats;
            if (androidAutofill != null) {
                androidx.compose.ui.autofill.AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
            }
        }
    }

    @Override // android.view.View
    public final void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> values) {
        androidx.compose.ui.autofill.AndroidAutofillManager androidAutofillManager;
        if (androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.performAutofill(values);
        }
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill = this.getOutputFormats;
        if (androidAutofill != null) {
            androidx.compose.ui.autofill.AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> response) {
        androidx.compose.ui.contentcapture.AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui(androidContentCaptureManager, response);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (this.coroutineCreation) {
            removeCallbacks(this.rsaCipher);
            if (motionEvent.getActionMasked() == 8) {
                this.coroutineCreation = false;
            } else {
                this.rsaCipher.run();
            }
        }
        if (Camera2StreamConfigurationMap(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return getHighSpeedVideoSizes(motionEvent);
            }
            return (getHighSpeedVideoFpsRanges(motionEvent) & 1) != 0;
        }
        if (motionEvent.isFromSource(2097152)) {
            androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent m7164convertToIndirectPointerEventk92h6UU$ui = this.c.m7164convertToIndirectPointerEventk92h6UU$ui(motionEvent, this.primaryDirectionalMotionAxisOverride);
            if (m7164convertToIndirectPointerEventk92h6UU$ui != null) {
                if (Camera2StreamConfigurationMap(m7164convertToIndirectPointerEventk92h6UU$ui)) {
                    return true;
                }
            } else {
                getFocusOwner().dispatchIndirectPointerCancel();
                this.accessartificialFrame.cancelCurrentEventStream();
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    private final boolean Camera2StreamConfigurationMap(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent) {
        boolean dispatchIndirectPointerEvent = getFocusOwner().dispatchIndirectPointerEvent(indirectPointerEvent);
        if (!androidx.compose.ui.ComposeUiFlags.isIndirectPointerNavigationGestureDetectorEnabled) {
            return dispatchIndirectPointerEvent;
        }
        this.accessartificialFrame.onIndirectPointerEvent(indirectPointerEvent, dispatchIndirectPointerEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Object m7721boximpl;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode;
        if (this.coroutineCreation) {
            removeCallbacks(this.rsaCipher);
            android.view.MotionEvent motionEvent2 = this.updateUI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || getHighSpeedVideoFpsRanges(motionEvent, motionEvent2)) {
                this.rsaCipher.run();
            } else {
                this.coroutineCreation = false;
            }
        }
        if (Camera2StreamConfigurationMap(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !getOutputMinFrameDuration(motionEvent))) {
            return false;
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(motionEvent);
        if ((highSpeedVideoFpsRanges & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(androidx.core.view.InputDeviceCompat.SOURCE_TOUCHPAD);
        if (z && z2) {
            java.lang.Object parent = getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view == null || (m7721boximpl = view.getTag(androidx.compose.ui.R.id.auto_clear_focus_behavior_tag)) == null) {
                m7721boximpl = androidx.compose.ui.platform.AutoClearFocusBehavior.m7721boximpl(androidx.compose.ui.platform.AutoClearFocusBehavior.INSTANCE.m7728getDefault4UtRPd4());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(m7721boximpl, androidx.compose.ui.platform.AutoClearFocusBehavior.m7721boximpl(androidx.compose.ui.platform.AutoClearFocusBehavior.INSTANCE.m7727getCursorBased4UtRPd4())) && (activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode()) != null) {
                if (!androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(activeFocusTargetNode)).m5778containsk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(motionEvent.getX()) << 32) | (java.lang.Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L)))) {
                    androidx.compose.ui.focus.FocusManager.clearFocus$default(getFocusOwner(), false, 1, null);
                }
            }
        }
        return (highSpeedVideoFpsRanges & 1) != 0;
    }

    private final boolean getHighSpeedVideoSizes(final android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        float scaledVerticalScrollFactor = androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext());
        return getFocusOwner().dispatchRotaryEvent(new androidx.compose.ui.input.rotary.RotaryScrollEvent(scaledVerticalScrollFactor * f, f * androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                boolean dispatchGenericMotionEvent;
                dispatchGenericMotionEvent = super/*android.view.ViewGroup*/.dispatchGenericMotionEvent(motionEvent);
                return java.lang.Boolean.valueOf(dispatchGenericMotionEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final int getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent) {
        removeCallbacks(this.free);
        try {
            getInputSizeshNQ4ISI(motionEvent);
            boolean z = true;
            this.getValidOutputFormatsForInputhNQ4ISI = true;
            measureAndLayout(false);
            android.os.Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                android.view.MotionEvent motionEvent2 = this.updateUI;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && getHighSpeedVideoFpsRanges(motionEvent, motionEvent2)) {
                    if (getHighResolutionOutputSizeshNQ4ISI(motionEvent2)) {
                        this.AMEXKernelCallback.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        getHighSpeedVideoFpsRanges(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                boolean z3 = motionEvent.getToolType(0) == 3;
                if (!z2 && z3 && actionMasked != 3 && actionMasked != 9 && getHighSpeedVideoFpsRangesFor(motionEvent)) {
                    getHighSpeedVideoFpsRanges(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                android.view.MotionEvent motionEvent3 = this.updateUI;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    android.view.MotionEvent motionEvent4 = this.updateUI;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.c.endStream(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        android.view.MotionEvent motionEvent5 = this.updateUI;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        android.view.MotionEvent motionEvent6 = this.updateUI;
                        boolean z4 = (x == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        android.view.MotionEvent motionEvent7 = this.updateUI;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z = false;
                        }
                        if (z4 || z) {
                            if (pointerId >= 0) {
                                this.c.endStream(pointerId);
                            }
                            this.AMEXKernelCallback.clearPreviouslyHitModifierNodes();
                        }
                    }
                }
                this.updateUI = android.view.MotionEvent.obtainNoHistory(motionEvent);
                return getOutputFormats(motionEvent);
            } finally {
                android.os.Trace.endSection();
            }
        } finally {
            this.getValidOutputFormatsForInputhNQ4ISI = false;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final int getOutputFormats(android.view.MotionEvent motionEvent) {
        androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData;
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
            this.getOutputSizes.m7769setKeyboardModifiers5xRPYO0(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7291constructorimpl(motionEvent.getMetaState()));
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.compose.ui.input.pointer.PointerInputEvent convertToPointerInputEvent$ui = this.c.convertToPointerInputEvent$ui(motionEvent, androidComposeView);
        int actionMasked = motionEvent.getActionMasked();
        if (convertToPointerInputEvent$ui != null) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputEventData> pointers = convertToPointerInputEvent$ui.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (!pointerInputEventData.getDown() || (actionMasked != 0 && actionMasked != 5 && androidx.compose.ui.ComposeUiFlags.isCanScrollUsingLastDownEventFixEnabled)) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        break;
                    }
                }
            }
            pointerInputEventData = null;
            androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.f2692a = pointerInputEventData2.m7246getPositionF1C5BW0();
            }
            int m7251processBIzXfog = this.AMEXKernelCallback.m7251processBIzXfog(convertToPointerInputEvent$ui, androidComposeView, getHighSpeedVideoFpsRangesFor(motionEvent));
            convertToPointerInputEvent$ui.setMotionEvent(null);
            if ((actionMasked != 0 && actionMasked != 5) || (m7251processBIzXfog & 1) != 0) {
                return m7251processBIzXfog;
            }
            this.c.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return m7251processBIzXfog;
        }
        this.AMEXKernelCallback.processCancel();
        return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new android.view.MotionEvent.PointerProperties();
        }
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new android.view.MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long mo7308localToScreenMKHz9U = mo7308localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (java.lang.Float.floatToRawIntBits(pointerCoords.x) << 32)));
            pointerCoords.x = java.lang.Float.intBitsToFloat((int) (mo7308localToScreenMKHz9U >> 32));
            pointerCoords.y = java.lang.Float.intBitsToFloat((int) (mo7308localToScreenMKHz9U & 4294967295L));
            i5++;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.compose.ui.input.pointer.PointerInputEvent convertToPointerInputEvent$ui = this.c.convertToPointerInputEvent$ui(obtain, androidComposeView);
        kotlin.jvm.internal.Intrinsics.checkNotNull(convertToPointerInputEvent$ui);
        this.AMEXKernelCallback.m7251processBIzXfog(convertToPointerInputEvent$ui, androidComposeView, true);
        obtain.recycle();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int direction) {
        return this.getOutputSizeshNQ4ISI.m7718canScroll0AR0LA0$ui(false, direction, this.f2692a);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int direction) {
        return this.getOutputSizeshNQ4ISI.m7718canScroll0AR0LA0$ui(true, direction, this.f2692a);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo7308localToScreenMKHz9U(long localPosition) {
        getHighSpeedVideoFpsRangesFor();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(this.BerTlvEncoder, localPosition) >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.kernelID >> 32));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (r8 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (this.kernelID & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + intBitsToFloat2) << 32));
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public final void mo7162localToScreen58bKbWc(float[] localTransform) {
        getHighSpeedVideoFpsRangesFor();
        androidx.compose.ui.graphics.Matrix.m6242timesAssign58bKbWc(localTransform, this.BerTlvEncoder);
        androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(localTransform, java.lang.Float.intBitsToFloat((int) (this.kernelID >> 32)), java.lang.Float.intBitsToFloat((int) (this.kernelID & 4294967295L)), this.setup);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo7309screenToLocalMKHz9U(long positionOnScreen) {
        getHighSpeedVideoFpsRangesFor();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (positionOnScreen >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.kernelID >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (positionOnScreen & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (this.kernelID & 4294967295L));
        return androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(this.provide, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 - intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - intBitsToFloat2) << 32)));
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            getHighSpeedVideoFpsRanges();
            android.view.ViewParent parent = getParent();
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
            while (parent instanceof android.view.ViewGroup) {
                androidComposeView = (android.view.View) parent;
                parent = ((android.view.ViewGroup) androidComposeView).getParent();
            }
            androidComposeView.getLocationOnScreen(this.newContext);
            int[] iArr = this.newContext;
            float f = iArr[0];
            float f2 = iArr[1];
            androidComposeView.getLocationInWindow(iArr);
            int[] iArr2 = this.newContext;
            float f3 = iArr2[0];
            float f4 = iArr2[1];
            this.kernelID = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f - f3) << 32) | (java.lang.Float.floatToRawIntBits(f2 - f4) & 4294967295L));
        }
    }

    private final void getInputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        getHighSpeedVideoFpsRanges();
        float[] fArr = this.BerTlvEncoder;
        float x = motionEvent.getX();
        long m6229mapMKHz9U = androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(fArr, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(x) << 32)));
        float rawX = motionEvent.getRawX();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m6229mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY();
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m6229mapMKHz9U & 4294967295L));
        this.kernelID = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(rawX - intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(rawY - intBitsToFloat2) & 4294967295L));
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.d.Camera2StreamConfigurationMap(this, this.BerTlvEncoder);
        androidx.compose.ui.platform.InvertMatrixKt.m7760invertToJiSxe2E(this.BerTlvEncoder, this.provide);
    }

    private final void getInputFormats() {
        androidx.compose.runtime.MutableState mutableState = this.getOutputSizes.getHighSpeedVideoSizes;
        if (mutableState != null) {
            mutableState.setValue(androidx.compose.ui.platform.AndroidWindowInfo_androidKt.calculateWindowSize(this));
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) androidx.compose.ui.SessionMutex.m5520getCurrentSessionimpl(this.start);
        if (androidPlatformTextInputSession == null) {
            return this.init.getCamera2StreamConfigurationMap();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) androidx.compose.ui.SessionMutex.m5520getCurrentSessionimpl(this.start);
        if (androidPlatformTextInputSession == null) {
            return this.init.createInputConnection(outAttrs);
        }
        return androidPlatformTextInputSession.createInputConnection(outAttrs);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public final long mo7685calculateLocalPositionMKHz9U(long positionInWindow) {
        getHighSpeedVideoFpsRangesFor();
        return androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(this.provide, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public final long mo7686calculatePositionInWindowMKHz9U(long localPosition) {
        getHighSpeedVideoFpsRangesFor();
        return androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(this.BerTlvEncoder, localPosition);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getHighResolutionOutputSizeshNQ4ISI(newConfig);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        int i = android.os.Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(getResources().getConfiguration());
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Configuration configuration) {
        boolean highSpeedVideoSizes;
        android.content.res.Configuration configuration2 = getConfiguration();
        if (kotlin.jvm.internal.Intrinsics.areEqual(configuration2, configuration)) {
            return;
        }
        setConfiguration(new android.content.res.Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(androidx.compose.ui.unit.AndroidDensity_androidKt.Density(getContext()));
        }
        highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(configuration2, configuration);
        if (highSpeedVideoSizes) {
            getInputFormats();
        }
        if (getHighSpeedVideoFpsRangesFor(configuration2) != getHighSpeedVideoFpsRangesFor(configuration)) {
            setFontFamilyResolver(androidx.compose.ui.text.font.FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int layoutDirection) {
        if (this.AMEXKernelProvider) {
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toLayoutDirection(layoutDirection);
            if (layoutDirection2 == null) {
                layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent event) {
        if (this.coroutineCreation) {
            removeCallbacks(this.rsaCipher);
            this.rsaCipher.run();
        }
        if (!Camera2StreamConfigurationMap(event) && isAttachedToWindow()) {
            this.getOutputSizeshNQ4ISI.dispatchHoverEvent$ui(event);
            int actionMasked = event.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && getHighSpeedVideoFpsRangesFor(event)) {
                    if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                        return false;
                    }
                    android.view.MotionEvent motionEvent = this.updateUI;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.updateUI = android.view.MotionEvent.obtainNoHistory(event);
                    this.coroutineCreation = true;
                    postDelayed(this.rsaCipher, 8L);
                    return false;
                }
            } else if (!getOutputMinFrameDuration(event)) {
                return false;
            }
            if ((getHighSpeedVideoFpsRanges(event) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean Camera2StreamConfigurationMap(android.view.MotionEvent motionEvent) {
        boolean z = (java.lang.Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (java.lang.Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (android.os.Build.VERSION.SDK_INT >= 29 && !androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE.getHighSpeedVideoSizes(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean getOutputMinFrameDuration(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.updateUI) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final android.view.View getHighSpeedVideoFpsRangesFor(int i, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getAccessibilityViewId", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.Intrinsics.areEqual(declaredMethod.invoke(view, new java.lang.Object[0]), java.lang.Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, viewGroup.getChildAt(i2));
            if (highSpeedVideoFpsRangesFor != null) {
                return highSpeedVideoFpsRangesFor;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent event, int pointerIndex) {
        androidx.compose.ui.input.pointer.PointerIcon getHighSpeedVideoFpsRangesFor2;
        int toolType = event.getToolType(pointerIndex);
        if (!event.isFromSource(8194) && event.isFromSource(androidx.core.view.InputDeviceCompat.SOURCE_STYLUS) && ((toolType == 2 || toolType == 4) && (getHighSpeedVideoFpsRangesFor2 = getPointerIconService().getGetHighSpeedVideoFpsRangesFor()) != null)) {
            androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN androidComposeViewVerificationHelperMethodsN = androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.INSTANCE;
            return androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.getHighResolutionOutputSizeshNQ4ISI(getContext(), getHighSpeedVideoFpsRangesFor2);
        }
        return super.onResolvePointerIcon(event, pointerIndex);
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.input.pointer.PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int accessibilityId) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.Object invoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(accessibilityId));
                if (invoke instanceof android.view.View) {
                    return (android.view.View) invoke;
                }
                return null;
            }
            return getHighSpeedVideoFpsRangesFor(accessibilityId, this);
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public final boolean isLifecycleInResumedState() {
        androidx.view.LifecycleOwner lifecycleOwner;
        androidx.view.Lifecycle lifecycle;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCamera2StreamConfigurationMap()) == androidx.lifecycle.Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void incrementSensitiveComponentCount() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            if (this.version == 0) {
                androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35 androidComposeViewSensitiveContent35 = androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35.INSTANCE;
                androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35.getHighSpeedVideoFpsRangesFor(getView(), true);
            }
            this.version++;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void decrementSensitiveComponentCount() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            if (this.version == 1) {
                androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35 androidComposeViewSensitiveContent35 = androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35.INSTANCE;
                androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35.getHighSpeedVideoFpsRangesFor(getView(), false);
            }
            this.version--;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void incrementKeepScreenOnCount() {
        this.b++;
        getView().setKeepScreenOn(this.b > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void decrementKeepScreenOnCount() {
        this.b--;
        getView().setKeepScreenOn(this.b > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public final androidx.compose.ui.platform.AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OutOfFrameExecutor
    public final void schedule(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean isEmpty = this.AMEXKernela.isEmpty();
        this.AMEXKernela.addLast(block);
        if (isEmpty) {
            android.os.Handler handler = getHandler();
            if (handler == null) {
                throw new java.lang.IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)".toString());
            }
            handler.postAtFrontOfQueue(this.exchange);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void voteFrameRate(float frameRate) {
        if (this.isArrEnabled) {
            if (frameRate > 0.0f) {
                if (java.lang.Float.isNaN(this.getOutputStallDuration) || frameRate > this.getOutputStallDuration) {
                    this.getOutputStallDuration = frameRate;
                    return;
                }
                return;
            }
            if (frameRate < 0.0f) {
                if (java.lang.Float.isNaN(this.unwrapAs) || frameRate < this.unwrapAs) {
                    this.unwrapAs = frameRate;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: dispatchOnScrollChanged-k-4lQ0M */
    public final void mo7687dispatchOnScrollChangedk4lQ0M(long delta) {
        INSTANCE.dispatchOnScrollChanged(getViewTreeObserver());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        getInputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getInputSizeshNQ4ISI();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean isInTouchMode) {
        this.getHighSpeedVideoSizesFor.m6749setInputModeiuPiT84(isInTouchMode ? androidx.compose.ui.input.InputMode.INSTANCE.m6746getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m6745getKeyboardaOaMEAU());
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", "dispatchOnScrollChanged", "(Landroid/view/ViewTreeObserver;)V", "Ljava/lang/Class;", "getOutputMinFrameDuration", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableObjectList;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$getIsShowingLayoutBounds(androidx.compose.ui.platform.AndroidComposeView.Companion companion) {
            return getHighResolutionOutputSizeshNQ4ISI();
        }

        private static boolean getHighResolutionOutputSizeshNQ4ISI() {
            try {
                if (androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration == null) {
                    androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration = java.lang.Class.forName("android.os.SystemProperties");
                }
                if (androidx.compose.ui.platform.AndroidComposeView.Camera2StreamConfigurationMap == null) {
                    java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration;
                    androidx.compose.ui.platform.AndroidComposeView.Camera2StreamConfigurationMap = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.Camera2StreamConfigurationMap;
                java.lang.Object invoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
                return kotlin.jvm.internal.Intrinsics.areEqual(invoke instanceof java.lang.Boolean ? (java.lang.Boolean) invoke : null, java.lang.Boolean.TRUE);
            } catch (java.lang.Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void getHighSpeedVideoSizes(androidx.compose.ui.platform.AndroidComposeView p0) {
            if (android.os.Build.VERSION.SDK_INT > 28) {
                if (androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoSizes == null) {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.compose.ui.platform.AndroidComposeView.Companion.getHighSpeedVideoFpsRangesFor();
                        }
                    };
                    androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoSizes = runnable;
                    android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
                    try {
                        if (androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration == null) {
                            androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration = java.lang.Class.forName("android.os.SystemProperties");
                        }
                        if (androidx.compose.ui.platform.AndroidComposeView.getHighResolutionOutputSizeshNQ4ISI == null) {
                            android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                            java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.getOutputMinFrameDuration;
                            androidx.compose.ui.platform.AndroidComposeView.getHighResolutionOutputSizeshNQ4ISI = cls != null ? cls.getDeclaredMethod("addChangeCallback", java.lang.Runnable.class) : null;
                        }
                        java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.getHighResolutionOutputSizeshNQ4ISI;
                        if (method != null) {
                            method.invoke(null, runnable);
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    android.os.StrictMode.setVmPolicy(vmPolicy);
                }
                synchronized (androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor) {
                    androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor.add(p0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoFpsRangesFor() {
            synchronized (androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor) {
                int i = 0;
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    androidx.collection.MutableObjectList mutableObjectList = androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object[] objArr = mutableObjectList.content;
                    int i2 = mutableObjectList._size;
                    while (i < i2) {
                        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) objArr[i];
                        boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                        androidx.compose.ui.platform.AndroidComposeView.Companion companion = androidx.compose.ui.platform.AndroidComposeView.INSTANCE;
                        androidComposeView.setShowLayoutBounds(getHighResolutionOutputSizeshNQ4ISI());
                        if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                            androidComposeView.invalidateDescendants();
                        }
                        i++;
                    }
                } else {
                    androidx.collection.MutableObjectList mutableObjectList2 = androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object[] objArr2 = mutableObjectList2.content;
                    int i3 = mutableObjectList2._size;
                    while (i < i3) {
                        ((androidx.compose.ui.platform.AndroidComposeView) objArr2[i]).invalidateDescendants();
                        i++;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AndroidComposeView p0) {
            if (android.os.Build.VERSION.SDK_INT > 28) {
                synchronized (androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor) {
                    androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRangesFor.remove(p0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }

        public final void dispatchOnScrollChanged(android.view.ViewTreeObserver viewTreeObserver) {
            try {
                if (androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRanges == null) {
                    java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRanges = declaredMethod;
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.getHighSpeedVideoFpsRanges;
                if (method != null) {
                    method.invoke(viewTreeObserver, new java.lang.Object[0]);
                }
            } catch (java.lang.Exception unused) {
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final androidx.view.LifecycleOwner lifecycleOwner;
        private final androidx.view.SavedStateRegistryOwner savedStateRegistryOwner;
        private final androidx.view.ViewModelStoreOwner viewModelStoreOwner;

        public ViewTreeOwners(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            this.viewModelStoreOwner = viewModelStoreOwner;
        }

        public final androidx.view.LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final androidx.view.SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public final androidx.view.ViewModelStoreOwner getViewModelStoreOwner() {
            return this.viewModelStoreOwner;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00182\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010$R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00101\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\"\u00104\u001a\u0002028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00103\u001a\u0004\b4\u00105\"\u0004\b-\u00106R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR%\u0010I\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00150E¢\u0006\u0002\bG8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010L\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/layout/WindowInsetsRulerProvider;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onRotaryScrollEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "onPreRotaryScrollEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "Landroidx/collection/ScatterMap;", "", "Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "getInsetsValues", "()Landroidx/collection/ScatterMap;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoSizes", "()Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoFpsRangesFor", "", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "()I", "(I)V", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "getCutoutRects", "()Landroidx/collection/MutableObjectList;", "", "Landroidx/compose/ui/layout/RectRulers;", "getCutoutRulers", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "getInputFormats", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "getInputSizeshNQ4ISI", "getTraverseKey", "()Ljava/lang/Object;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RootModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.relocation.BringIntoViewModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.input.rotary.RotaryInputModifierNode, androidx.compose.ui.input.key.KeyInputModifierNode, androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.TraversableNode, androidx.compose.ui.layout.WindowInsetsRulerProvider {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges = -1;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getInputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.RulerScope rulerScope) {
                getHighSpeedVideoFpsRangesFor(rulerScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.RulerScope rulerScope) {
                androidx.compose.ui.platform.AndroidComposeView.RootModifierNode rootModifierNode = androidx.compose.ui.platform.AndroidComposeView.RootModifierNode.this;
                rootModifierNode.getHighResolutionOutputSizeshNQ4ISI(rootModifierNode.getHighSpeedVideoSizes().getIntValue());
                if (androidx.compose.ui.platform.AndroidComposeView.RootModifierNode.this.getGetHighSpeedVideoFpsRanges() <= 0 || !androidx.compose.ui.ComposeUiFlags.areWindowInsetsRulersEnabled) {
                    return;
                }
                androidx.compose.ui.layout.WindowInsetsRulers_androidKt.provideWindowInsetsRulers(rulerScope, androidx.compose.ui.platform.AndroidComposeView.RootModifierNode.this);
            }

            {
                super(1);
            }
        };

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onPreKeyEvent-ZmokQxo */
        public final boolean mo1263onPreKeyEventZmokQxo(android.view.KeyEvent p0) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public final boolean onPreRotaryScrollEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent p0) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public final boolean onRotaryScrollEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent p0) {
            return false;
        }

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public final androidx.collection.ScatterMap<java.lang.Object, androidx.compose.ui.layout.WindowWindowInsetsAnimationValues> getInsetsValues() {
            return getInsetsListener().getInsetsValues();
        }

        public final androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes() {
            return getInsetsListener().getGeneration();
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public final androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> getCutoutRects() {
            return getInsetsListener().getDisplayCutouts();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public final java.util.List<androidx.compose.ui.layout.RectRulers> getCutoutRulers() {
            return getInsetsListener().getDisplayCutoutRulers();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public final androidx.compose.ui.layout.InsetsListener getInsetsListener() {
            return androidx.compose.ui.platform.AndroidComposeView.this.getInsetsListener();
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s */
        public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, this.getInputSizeshNQ4ISI, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    Camera2StreamConfigurationMap(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(1);
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.node.TraversableNode
        public final java.lang.Object getTraverseKey() {
            return androidx.compose.ui.layout.WindowInsetsRulers_androidKt.RulerKey;
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public final java.lang.Object bringIntoView(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            androidx.compose.ui.geometry.Rect invoke = function0.invoke();
            androidx.compose.ui.geometry.Rect m5789translatek4lQ0M = invoke != null ? invoke.m5789translatek4lQ0M(positionInRoot) : null;
            if (m5789translatek4lQ0M != null) {
                androidx.compose.ui.platform.AndroidComposeView.this.requestRectangleOnScreen(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(m5789translatek4lQ0M), false);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onKeyEvent-ZmokQxo */
        public final boolean mo1261onKeyEventZmokQxo(android.view.KeyEvent p0) {
            androidx.compose.ui.geometry.Rect embeddedViewFocusRect;
            java.lang.Boolean mo5664focusSearchULY8qGw;
            java.lang.Boolean mo5664focusSearchULY8qGw2;
            final androidx.compose.ui.focus.FocusDirection m5658toFocusDirectionZmokQxo = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5658toFocusDirectionZmokQxo(p0);
            if (m5658toFocusDirectionZmokQxo == null || !androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(p0), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY())) {
                return false;
            }
            if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null && activeFocusTargetNode.getIsInteropViewHost() && androidx.compose.ui.platform.AndroidComposeView.this.mo5697moveFocusInChildren3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap())) {
                    return true;
                }
                java.lang.Boolean mo5664focusSearchULY8qGw3 = androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5664focusSearchULY8qGw(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap(), androidx.compose.ui.platform.AndroidComposeView.this.getEmbeddedViewFocusRect(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                        return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.this.getCamera2StreamConfigurationMap()));
                    }

                    {
                        super(1);
                    }
                });
                if (mo5664focusSearchULY8qGw3 == null || mo5664focusSearchULY8qGw3.booleanValue()) {
                    return true;
                }
                if (androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap())) {
                    java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap());
                    int intValue = m5657toAndroidFocusDirection3ESFkO8 != null ? m5657toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
                    android.view.View rootView = androidx.compose.ui.platform.AndroidComposeView.this.getRootView();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(rootView, "");
                    android.view.View findNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, androidx.compose.ui.platform.AndroidComposeView.this.getView(), intValue);
                    if (findNextFocus == null || kotlin.jvm.internal.Intrinsics.areEqual(findNextFocus, androidx.compose.ui.platform.AndroidComposeView.this)) {
                        return androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5667resetFocus3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap());
                    }
                }
                return false;
            }
            java.lang.Integer m5657toAndroidFocusDirection3ESFkO82 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap());
            if ((!androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled || !androidx.compose.ui.platform.AndroidComposeView.this.hasFocus() || m5657toAndroidFocusDirection3ESFkO82 == null || !androidx.compose.ui.platform.AndroidComposeView.this.mo5697moveFocusInChildren3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap())) && (mo5664focusSearchULY8qGw = androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5664focusSearchULY8qGw(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap(), (embeddedViewFocusRect = androidx.compose.ui.platform.AndroidComposeView.this.getEmbeddedViewFocusRect()), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                    return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.this.getCamera2StreamConfigurationMap()));
                }

                {
                    super(1);
                }
            })) != null && !mo5664focusSearchULY8qGw.booleanValue()) {
                if (!androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap())) {
                    return false;
                }
                if (m5657toAndroidFocusDirection3ESFkO82 != null) {
                    android.view.View highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView.this.getHighSpeedVideoSizes(m5657toAndroidFocusDirection3ESFkO82.intValue());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, androidx.compose.ui.platform.AndroidComposeView.this)) {
                        highSpeedVideoSizes = null;
                    }
                    if (highSpeedVideoSizes != null) {
                        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                        if (androidRect != null) {
                            android.view.View rootView2 = androidx.compose.ui.platform.AndroidComposeView.this.getRootView();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(rootView2, "");
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView2;
                            viewGroup.offsetDescendantRectToMyCoords(androidx.compose.ui.platform.AndroidComposeView.this.getView(), androidRect);
                            viewGroup.offsetRectIntoDescendantCoords(highSpeedVideoSizes, androidRect);
                            if (androidx.compose.ui.focus.FocusInteropUtils_androidKt.requestInteropFocus(highSpeedVideoSizes, m5657toAndroidFocusDirection3ESFkO82, androidRect)) {
                                return true;
                            }
                        } else {
                            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid rect");
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                }
                if (androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5661clearFocusI7lrPNg(false, true, false, m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap()) && (mo5664focusSearchULY8qGw2 = androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo5664focusSearchULY8qGw(m5658toFocusDirectionZmokQxo.getCamera2StreamConfigurationMap(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                        return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.this.getCamera2StreamConfigurationMap()));
                    }

                    {
                        super(1);
                    }
                })) != null) {
                    return mo5664focusSearchULY8qGw2.booleanValue();
                }
            }
            return true;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public final void mo7688measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode layoutNode, long constraints) {
        android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.kernelVersion.m7586measureAndLayout0kLqBqw(layoutNode, constraints);
            if (!this.kernelVersion.getHasPendingMeasureOrLayout()) {
                androidx.compose.ui.node.MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.kernelVersion, false, 1, null);
                getHighSpeedVideoSizes();
            }
            getRectManager().dispatchCallbacks();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        android.os.Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                getHighSpeedVideoSizes(getRoot());
            }
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(widthMeasureSpec);
            int m23494constructorimpl = (int) kotlin.ULong.m23494constructorimpl(highSpeedVideoFpsRanges >>> 32);
            int m23494constructorimpl2 = (int) kotlin.ULong.m23494constructorimpl(highSpeedVideoFpsRanges & 4294967295L);
            long highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(heightMeasureSpec);
            long m8562fitPrioritizingHeightZbe2FdA = androidx.compose.ui.unit.Constraints.INSTANCE.m8562fitPrioritizingHeightZbe2FdA(m23494constructorimpl, m23494constructorimpl2, (int) kotlin.ULong.m23494constructorimpl(highSpeedVideoFpsRanges2 >>> 32), (int) kotlin.ULong.m23494constructorimpl(4294967295L & highSpeedVideoFpsRanges2));
            androidx.compose.ui.unit.Constraints constraints = this.release;
            if (constraints == null) {
                this.release = androidx.compose.ui.unit.Constraints.m8542boximpl(m8562fitPrioritizingHeightZbe2FdA);
                this.aid = false;
            } else if (constraints == null || !androidx.compose.ui.unit.Constraints.m8548equalsimpl0(constraints.getGetHighSpeedVideoFpsRangesFor(), m8562fitPrioritizingHeightZbe2FdA)) {
                this.aid = true;
            }
            this.kernelVersion.m7587updateRootConstraintsBRTryo0(m8562fitPrioritizingHeightZbe2FdA);
            this.kernelVersion.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.getInputSizeshNQ4ISI != null) {
                getAndroidViewsHandler$ui().measure(android.view.View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        android.os.Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.AMEXKernela.isEmpty()) {
            try {
                androidComposeView.AMEXKernela.removeLast().invoke();
            } finally {
                android.os.Trace.endSection();
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new androidx.compose.ui.platform.AndroidComposeView.Companion(defaultConstructorMarker);
        getHighSpeedVideoFpsRangesFor = new androidx.collection.MutableObjectList<>(0, 1, defaultConstructorMarker);
    }
}
